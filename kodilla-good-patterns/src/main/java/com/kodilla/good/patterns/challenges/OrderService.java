package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(final Product product, final User user, final LocalDateTime orderDate);
}
