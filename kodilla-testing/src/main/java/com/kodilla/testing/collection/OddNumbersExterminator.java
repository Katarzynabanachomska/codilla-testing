package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> ar = new ArrayList<>();

    ArrayList<Integer> exterminate (ArrayList<Integer> numbers) {
        for (int n=0; n <numbers.size();n++) {
            int a = numbers.get(n);
            if (a % 2 == 0) {
                ar.add(a);
            }
        }
        return ar;
    }
}


