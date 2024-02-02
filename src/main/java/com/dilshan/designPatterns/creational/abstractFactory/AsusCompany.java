package com.dilshan.designPatterns.creational.abstractFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AsusCompany extends AbstractCompany {
    @Override
    public Gpu createGpu() {
        log.info("Create Asus Gpu from Company!");
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        log.info("Create Asus Monitor from Company!");
        return new AsusMonitor();
    }
}
