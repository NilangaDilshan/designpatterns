package com.dilshan.designPatterns.creational.builder;

public class Test {
    public static void main(String[] args) {
        Phone p1 = new Phone.Builder().os("Apple").processor("Intel").build();
        System.out.print(p1.toString());
    }
}
