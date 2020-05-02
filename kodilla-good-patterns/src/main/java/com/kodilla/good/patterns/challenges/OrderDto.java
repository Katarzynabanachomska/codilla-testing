package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private User user;
    private Product listOfOrderedProducts;
    private boolean isOrdered;

    public OrderDto(User user, Product listOfOrderedProducts, boolean isOrdered) {
        this.user = user;
        this.listOfOrderedProducts = listOfOrderedProducts;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Product getListOfOrderedProducts() {
        return listOfOrderedProducts;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
