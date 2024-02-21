package com.dilshan.designPatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Memory {

    public void loadMemory() {
        log.info("Loading Memory...");
    }

    public void unloadMemory() {
        log.info("Unloading Memory...");
    }
}
