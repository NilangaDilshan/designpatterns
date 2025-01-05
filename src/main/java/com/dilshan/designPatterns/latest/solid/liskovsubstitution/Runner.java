package com.dilshan.designPatterns.latest.solid.liskovsubstitution;

public class Runner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Rectangle Area: " + rectangle.computeArea());

        Square square = new Square(10);
        System.out.println("Square Area: " + square.computeArea());

        useRectangle(rectangle);
    }

    private static void useRectangle(Rectangle rectangle) {
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        assert rectangle.getHeight() == 20 : "Height is not equal to 20";
        assert rectangle.getWidth() == 30 : "Width is not equal to 30";
    }
}
