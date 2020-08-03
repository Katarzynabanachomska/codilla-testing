package com.kodilla.good.patterns.challenges.food2Door;

import java.util.Map;

public class GlutenFreeShop implements Supplier {


    public boolean process(Map<Product, Integer> listOfProducts) {

        System.out.println("Ordering  from Gluten Free Shop.");

        return true;
    }
}
