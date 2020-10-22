package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Invoice invoice1 = new Invoice("17");

        Product product1 = new Product("car");
        Product product2 = new Product("bike");
        Product product3 = new Product("scooter");

        Item item1 = new Item(product1, new BigDecimal(50000), 2);
        Item item2 = new Item(product2, new BigDecimal(2000), 3);
        Item item3 = new Item(product3, new BigDecimal(500), 4);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        invoice1.setItems(items);

        //When
        invoiceDao.save(invoice1);
        int invoiceId = invoice1.getId();
        int itemSize = invoice1.getItems().size();
        List<Item> invoice1Items = invoice1.getItems();

        Invoice invoiceFromDB = invoiceDao.findById(invoiceId);

        //Then
        Assert.assertEquals(invoiceId, invoiceFromDB.getId());
        Assert.assertEquals(3, itemSize);
        Assert.assertEquals(itemSize, invoiceFromDB.getItems().size());
        Assert.assertEquals(invoice1Items, invoiceFromDB.getItems());

        //CleanUp
        try {
            invoiceDao.deleteById(invoiceId);
        } catch (Exception e) {
        }
    }
}
