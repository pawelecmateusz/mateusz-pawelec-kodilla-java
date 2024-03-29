package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderWatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)) && args(order, userId)")
    public void logBeforeProcessOrder(OrderDto order, Long userId) {
        LOGGER.info("Processing new order for user ID: " + userId);
    }

    @After("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logAfterProcessOrder() {
        LOGGER.info("Processing finished.");
    }
}