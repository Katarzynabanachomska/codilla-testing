package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private OrderService orderService;
    private ProductRepository productRepository;
    private InformationServices informationServices;

    public ProductOrderService(OrderService orderService, ProductRepository productRepository, InformationServices informationServices) {
        this.orderService = orderService;
        this.productRepository = productRepository;
        this.informationServices = informationServices;
    }

    OrderDto process (final OrderRequest orderRequest, final ProductsDatabase productsDatabase, final UserDto userDto) {
        boolean isOrdered = orderService.order(orderRequest, productsDatabase , userDto);
        if (isOrdered) {
            informationServices.sendConfirmationToUser(orderRequest.getUser());
            productRepository.saveOrderIntoRepository(orderRequest);
            System.out.println("Order is acepted :)");
            return new OrderDto(orderRequest.getUser(), orderRequest.getListOfOrderedProducts(), true);
        }
        System.out.println("Order isn't accepted :(");
        return new OrderDto(orderRequest.getUser(), orderRequest.getListOfOrderedProducts(),false);
    }
}
