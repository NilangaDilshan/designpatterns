package com.dilshan.designPatterns.structural.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        this.loadFromDisk();
    }

    private void loadFromDisk() {
        log.info("Loading from the disk: {}", this.fileName);
    }

    @Override
    public void display() {
        log.info("This is the real image...");
    }
}
