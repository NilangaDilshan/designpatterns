package com.dilshan.designPatterns.behavioral.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Kitchen {
    public void prepareDish(String dish) {
        log.info("Preparing Dish: {}", dish);
    }

    public void cancelDish(String dish) {
        log.info("Canceling Dish: {}", dish);
    }
}
