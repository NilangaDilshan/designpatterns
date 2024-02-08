package com.dilshan.designPatterns.creational.abstractFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MsiCompany extends AbstractCompany {
    @Override
    public Gpu createGpu() {
        log.info("Create MSI Gpu from Company!");
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        log.info("Create MSI Monitor from Company!");
        return new MsiMonitor();
    }
}
