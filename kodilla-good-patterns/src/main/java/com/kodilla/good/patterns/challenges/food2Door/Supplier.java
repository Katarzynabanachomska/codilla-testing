package com.kodilla.good.patterns.challenges.food2Door;

import java.util.Map;

public interface Supplier {

    public boolean process(Map<Product, Integer> listOfProducts);
}