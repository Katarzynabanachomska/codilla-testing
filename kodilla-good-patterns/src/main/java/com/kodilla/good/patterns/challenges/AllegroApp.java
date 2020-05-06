package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AllegroApp {
    public static void main(String[] args) {

        User user1 = new User("Kasia", "Banachomska", 1233);
        User user2 = new User("Karolina", "Baca", 1542);

        HulaHop hulaHop = new HulaHop("Slim Hulahop", 53, 1639, 2);
        HulaHop hulaHop1 = new HulaHop("Duo Hulahop", 60, 9188, 1);
        HulaHop hulaHop2 = new HulaHop("Hulahop", 40, 988, 0);

        ProductsDatabase productsDatabase = new ProductsDatabase();
        productsDatabase.addProduct(hulaHop);
        productsDatabase.addProduct(hulaHop1);
        productsDatabase.addProduct(hulaHop2);

        Product product1 = new HulaHop("Slim Hulahop", 53, 1639, 2);

        List<Product> orderedList1 = new ArrayList<>();
        orderedList1.add(hulaHop);
        orderedList1.add(hulaHop1);
        orderedList1.add(hulaHop2);

        OrderRequest orderRequest = new OrderRequest(user1, product1, LocalDateTime.of(2020, 3, 4, 8, 5));

        UserDto userDto = new UserDto();
        userDto.addClient(user1);
        userDto.addClient(user2);

        InformationServices emailInformationServices = new EmailInformationServices();
        OrderService userOrderChecker = new UserOrderChecker();
        OrderRepository myNewOrderRepository = new OrderDbService();
        ProductOrderService productOrderService = new ProductOrderService(userOrderChecker, myNewOrderRepository, emailInformationServices, userDto);
        productOrderService.process(orderRequest, productsDatabase);

    }
}