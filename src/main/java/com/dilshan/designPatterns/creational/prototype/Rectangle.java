package com.dilshan.designPatterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rectangle implements Shape {
    private String type;

    public Rectangle(String type) {
        this.type = type;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.type);
    }

    @Override
    public void draw() {
        log.info("Drawing rectangle with type: {}", this.type);
    }
}
