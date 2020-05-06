package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private Product listOfOrderedProducts;
    private LocalDateTime orderedAt;

    public OrderRequest(User user, Product listOfOrderedProducts, LocalDateTime orderedAt) {
        this.user = user;
        this.listOfOrderedProducts = listOfOrderedProducts;
        this.orderedAt = orderedAt;
    }

    public User getUser() {

        return user;
    }

    public Product getListOfOrderedProducts() {

        return listOfOrderedProducts;
    }

    public LocalDateTime getOrderedAt() {

        return orderedAt;
    }
}
