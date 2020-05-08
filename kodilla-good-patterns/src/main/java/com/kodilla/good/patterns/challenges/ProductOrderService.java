package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private OrderService orderService;
    private OrderRepository orderRepository;
    private InformationServices informationServices;

    public ProductOrderService(OrderService orderService, OrderRepository orderRepository,
                               InformationServices informationServices) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.informationServices = informationServices;
    }

    OrderDto process (final OrderRequest orderRequest, final ProductsDatabase productsDatabase) {
        boolean isOrdered = orderService.order(orderRequest, productsDatabase, orderRequest.getUser());
        if (isOrdered) {
            informationServices.sendConfirmationToUser(orderRequest.getUser());
            orderRepository.saveOrderIntoRepository(orderRequest);
            System.out.println("Order is acepted :)");
            return new OrderDto(orderRequest.getUser(), orderRequest.getListOfOrderedProducts(), true);
        } else {
            System.out.println("Order isn't accepted :(");
            return new OrderDto(orderRequest.getUser(), orderRequest.getListOfOrderedProducts(),false);
        }
    }
}
