package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class ProductsDatabase {

    private Map<Integer,Product> productMap = new HashMap<>();

    public void addProduct(Product product) {
        if (product != null && productMap.get(product.getProductId()) == null) {
            productMap.put(product.getProductId(), product);
        } else {
            System.out.println("There is already: " + product + "in database");
        }
    }
    boolean availabilityOfProducts (Product product) {
        int quantityOfAvailableProduct = 0;
        for (Map.Entry<Integer, Product> entry : productMap.entrySet()) {
                if (entry.getValue().equals(product)) {
                    return true;
                }
        }

        System.out.println("There are no such quantities of products");
        return false;
    }
}
