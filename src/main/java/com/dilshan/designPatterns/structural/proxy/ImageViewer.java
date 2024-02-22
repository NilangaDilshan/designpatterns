package com.dilshan.designPatterns.structural.proxy;

public class ImageViewer {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test");
        Image image2 = new ProxyImage("test_2");
        image1.display();
        image1.display();
        image2.display();
    }
}
