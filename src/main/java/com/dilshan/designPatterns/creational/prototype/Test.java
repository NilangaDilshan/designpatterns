package com.dilshan.designPatterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static void main(String[] args) {
        Shape circlePrototype = new Circle("Red");
        Shape rectanglePrototype = new Rectangle("Square");

        Shape circle1 = circlePrototype.clone();
        Shape circle2 = circlePrototype.clone();
        Shape rectangle1 = rectanglePrototype.clone();
        Shape rectangle2 = rectanglePrototype.clone();

        circle1.draw();
        circle2.draw();
        rectangle1.draw();
        rectangle2.draw();
    }
}
