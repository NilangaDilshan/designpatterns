package com.dilshan.designPatterns.creational.abstractFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        log.info("This is MSI Monitor Assemble Method!");
    }
}
