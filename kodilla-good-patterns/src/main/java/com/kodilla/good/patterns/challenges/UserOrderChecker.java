package com.kodilla.good.patterns.challenges;

public class UserOrderChecker implements OrderService {

    @Override
    public boolean order(OrderRequest orderRequest, ProductsDatabase productsDatabase, User user) {
        return productsDatabase.availabilityOfProducts(orderRequest.getListOfOrderedProducts());
//                &&
//                userDto.checkAvailabilityOfCustomer(orderRequest.getUser());
    }
}
