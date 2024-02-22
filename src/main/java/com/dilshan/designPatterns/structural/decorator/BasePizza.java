package com.dilshan.designPatterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BasePizza implements Pizza {
    @Override
    public String bake() {
        log.info("This is Base Pizza Bake method...");
        return "Base Pizza";
    }
}
