package com.kodilla.good.patterns.challenges;

public interface OrderService {
    boolean order(OrderRequest orderRequest, ProductsDatabase productsDatabase, UserDto userDto);
}
