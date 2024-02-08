package com.dilshan.designPatterns.creational.abstractFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AsusMonitor implements Monitor {
    @Override
    public void assemble() {
        log.info("This is Asus Monitor Assemble Method!");
    }
}
