package com.dilshan.designPatterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new BasePizza();
        //log.info("Base Pizza bake: {}", pizza.bake());
        pizza = new CheesePizzaDecorator(pizza);
        //log.info("Cheese Pizza bake: {}", pizza.bake());
        pizza = new JalapenoPizzaDecorator(pizza);
        log.info("Pizza Bake: {}", pizza.bake());
    }
}
