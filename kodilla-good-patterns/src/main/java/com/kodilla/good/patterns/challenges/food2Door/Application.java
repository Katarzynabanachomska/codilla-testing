package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public Application() {
    }

    public static void main(String[] args) {

        Product product1 = new Product("caviar");
        Product product2 = new Product("ham");
        Product product3 = new Product("tuber");

        Map<Product, Integer> listOfProducts = new HashMap<>();
        listOfProducts.put(product1, 5);
        listOfProducts.put(product2, 3);
        listOfProducts.put(product3, 7);


        Order order = new Order();
        order.order(new GlutenFreeShop(), listOfProducts);
    }
}
