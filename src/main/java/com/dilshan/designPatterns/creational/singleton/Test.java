package com.dilshan.designPatterns.creational.singleton;

public class Test {
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getDatabaseConnection();
        System.err.print(singletonInstance);
    }
}
