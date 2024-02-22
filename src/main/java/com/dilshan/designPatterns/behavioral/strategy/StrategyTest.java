package com.dilshan.designPatterns.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new AddStrategy());
        log.info("Add Operation Result: {}", context.executeOperation(1, 2));

        context = new Context(new SubtractionStrategy());
        log.info("Subtraction Operation Result: {}", context.executeOperation(1, 2));

        context = new Context(new MultiplicationStrategy());
        log.info("Multiplication Operation Result: {}", context.executeOperation(1, 2));

        context = new Context(new DivisionStrategy());
        log.info("Division Operation Result: {}", context.executeOperation(1, 2));
    }
}
