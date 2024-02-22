package com.dilshan.designPatterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JalapenoPizzaDecorator extends PizzaDecorator {

    public JalapenoPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        log.info("This is Jalapeno Pizza bake method...");
        return String.format("%s + Jalapeno Pizza", this.pizza.bake());
    }

    public String addJalapeno() {
        return "Jalapeno";
    }
}
