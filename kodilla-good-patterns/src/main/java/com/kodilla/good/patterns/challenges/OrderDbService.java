package com.kodilla.good.patterns.challenges;

public class OrderDbService implements OrderRepository {
    @Override
    public void saveOrderIntoRepository(OrderRequest orderRequest) {
        System.out.printf("Saving data into order database....");
    }
}
