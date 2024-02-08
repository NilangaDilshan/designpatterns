package com.dilshan.designPatterns.creational.singleton;

import lombok.ToString;

@ToString
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getDatabaseConnection() {
        if (null==instance) {
            instance = new Singleton();
        }
        return instance;
    }
}
