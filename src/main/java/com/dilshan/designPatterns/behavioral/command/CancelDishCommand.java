package com.dilshan.designPatterns.behavioral.command;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CancelDishCommand implements OrderCommand {
    private final Kitchen kitchen;
    private final String dish;

    @Override
    public void execute() {
        this.kitchen.cancelDish(dish);
    }
}
