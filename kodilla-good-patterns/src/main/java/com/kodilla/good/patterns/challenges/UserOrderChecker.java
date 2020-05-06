package com.kodilla.good.patterns.challenges;

public class UserOrderChecker implements OrderService {

    @Override
    public boolean order(OrderRequest orderRequest, ProductsDatabase productsDatabase, UserDto userDto) {
        return productsDatabase.availabilityOfProducts(orderRequest.getListOfOrderedProducts()) &&
                userDto.checkAvailabilityOfCustomer(orderRequest.getUser());
    }
}
