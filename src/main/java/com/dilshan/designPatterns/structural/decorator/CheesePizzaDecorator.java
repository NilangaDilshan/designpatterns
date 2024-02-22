package com.dilshan.designPatterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheesePizzaDecorator extends PizzaDecorator {

    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        log.info("Cheese Pizza Bake method...");
        return String.format("%s + Cheese Pizza", this.pizza.bake());
    }

    public String addCheese() {
        return "Adding Cheese";
    }
}
