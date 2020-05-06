package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class Product {
    private String nameProduct;
    private double price;
    private Integer productId;
    private Integer quantity;

    public Product(String nameProduct, double price, Integer productId, Integer quantity) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getNameProduct() {

        return nameProduct;
    }

    public double getPrice() {

        return price;
    }

    public Integer getProductId() {

        return productId;
    }

    public Integer getQuantity() {

        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getPrice(), getPrice()) == 0 &&
                getNameProduct().equals(product.getNameProduct()) &&
                getProductId().equals(product.getProductId()) &&
                getQuantity().equals(product.getQuantity());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNameProduct(), getPrice(), getProductId(), getQuantity());
    }
}
