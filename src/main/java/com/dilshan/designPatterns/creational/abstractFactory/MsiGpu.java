package com.dilshan.designPatterns.creational.abstractFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        log.info("This is MSI GPU Assemble!");
    }
}
