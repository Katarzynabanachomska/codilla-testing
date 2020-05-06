package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private OrderService orderService;
    private OrderRepository orderRepository;
    private InformationServices informationServices;
    private UserDto userDto;

    public ProductOrderService(OrderService orderService, OrderRepository orderRepository,
                               InformationServices informationServices, UserDto userDto) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.informationServices = informationServices;
        this.userDto = userDto;
    }

    OrderDto process (final OrderRequest orderRequest, final ProductsDatabase productsDatabase) {
        boolean isOrdered = orderService.order(orderRequest, productsDatabase, userDto);
        if (isOrdered) {
            informationServices.sendConfirmationToUser(orderRequest.getUser());
            orderRepository.saveOrderIntoRepository(orderRequest);
            System.out.println("Order is acepted :)");
            return new OrderDto(orderRequest.getUser(), orderRequest.getListOfOrderedProducts(), true);
        }
        System.out.println("Order isn't accepted :(");
        return new OrderDto(orderRequest.getUser(), orderRequest.getListOfOrderedProducts(),false);
    }
}
