package com.kodilla.spring.shape;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Square implements Shape{
    @Override
    public String getShapeName() {
        return "This is a square.";
    }
}
