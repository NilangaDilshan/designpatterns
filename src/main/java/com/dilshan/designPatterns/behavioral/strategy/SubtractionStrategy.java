package com.dilshan.designPatterns.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubtractionStrategy implements Strategy {
    @Override
    public double doOperation(double input1, double input2) {
        log.info("Subtraction operation Input1: {} Input2: {}", input1, input2);
        return input1 - input2;
    }
}
