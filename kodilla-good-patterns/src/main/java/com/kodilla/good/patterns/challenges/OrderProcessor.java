package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private final OrderInformationService informationService;
    private final OrderService orderService;
    private final DefaultOrderRepository defaultOrderRepository;

    public OrderProcessor(final OrderInformationService informationService,
                          final OrderService orderService,
                          final DefaultOrderRepository defaultOrderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.defaultOrderRepository = defaultOrderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isBought = orderService.order(orderRequest.getProduct(), orderRequest.getUser(), orderRequest.getOrderDate());

        if (isBought) {
            informationService.inform(orderRequest.getUser());
            defaultOrderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getProduct(), orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getProduct(), orderRequest.getUser(), false);
        }
    }
}