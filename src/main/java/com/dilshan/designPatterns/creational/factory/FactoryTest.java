package com.dilshan.designPatterns.creational.factory;

public class FactoryTest {
    public static void main(String[] args) {
        OperatingSystemFactory osFactory = new OperatingSystemFactory();
        OS android = osFactory.getInstance("IOS");
        android.getName();
        android.getVersion();

    }
}
