package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private OrderInformationService informationService;
    private OrderService orderService;
    private DefaultOrderRepository defaultOrderRepository;

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
            return new OrderDto(orderRequest.getProduct(), orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getProduct(), orderRequest.getUser(), false);
        }
    }
}
