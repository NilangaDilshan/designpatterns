package com.dilshan.designPatterns.structural.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxyImage implements Image {
    private final String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (null == realImage)
            this.realImage = new RealImage(this.fileName);
        this.realImage.display();
    }
}
