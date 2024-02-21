package com.dilshan.designPatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cpu {

    public void startCpu() {
        log.info("Starting CPU...");
    }

    public void shutdownCpu() {
        log.info("Shutting down CPU...");
    }

}
