package com.dilshan.designPatterns.creational.factory;

public class OperatingSystemFactory {
    public OS getInstance(String os) {
        switch (os) {
            case "IOS":
                return new IOS();
            case "Windows":
                return new Windows();
            case "Android":
            default:
                return new AndroidOS();
        }
    }
}
