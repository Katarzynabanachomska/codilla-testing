package com.kodilla.good.patterns.challenges;

import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class User1 {
    public static void main(String[] args) {

        User user1 = new User("Kasia", "Banachomska", "152");
        User user2 = new User("Karolina", "Baca", "342");

        HulaHop hulaHop = new HulaHop("Slim Hulahop", "50.99", "1639", "2");
        HulaHop hulaHop1 = new HulaHop("Duo Hulahop", "30.77", "9188", "1");

        ProductsDatabase productsDatabase = new ProductsDatabase();
        productsDatabase.addProduct(hulaHop);
        productsDatabase.addProduct(hulaHop1);

        Product orderedList1 = new ArrayList<>();
        orderedList1.add(hulaHop);
        orderedList1.add(hulaHop1);

        OrderRequest orderRequest = new OrderRequest(user1, orderedList1, LocalDateTime.of(2020, 3, 4, 8,5));

        InformationServices emailInformationServices = new EmailInformationServices();
        OrderService userOrderChecker = new UserOrderChecker();
        ProductRepository myOrderRepository = new MyNewOrderRepository();

        ProductOrderService productOrderService = new ProductOrderService();

        productOrderService.process(orderRequest, productsDatabase);
        }
    }