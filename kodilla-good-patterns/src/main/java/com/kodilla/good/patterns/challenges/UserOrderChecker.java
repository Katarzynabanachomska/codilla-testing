package com.kodilla.good.patterns.challenges;

public class UserOrderChecker implements OrderService {

    @Override
    public boolean order(OrderRequest orderRequest, ProductsDatabase productsDatabase, UserDto userDto) {
        return false;
    }
}
