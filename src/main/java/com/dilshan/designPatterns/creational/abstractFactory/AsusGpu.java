package com.dilshan.designPatterns.creational.abstractFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AsusGpu implements Gpu {
    @Override
    public void assemble() {

        log.info("This is ASUS GPU Assemble!");
    }
}
