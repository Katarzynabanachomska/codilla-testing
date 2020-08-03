package com.kodilla.good.patterns.challenges.food2Door;

import java.util.Map;

public class Order {

    public void order(Supplier supplier, Map<Product, Integer> listOfProducts) {

        boolean ordered = supplier.process(listOfProducts);

        if (ordered) {

            System.out.println("Your order has been completed.");

        } else {

            System.out.println("Your order hasn't been completed.");
        }
    }
}
