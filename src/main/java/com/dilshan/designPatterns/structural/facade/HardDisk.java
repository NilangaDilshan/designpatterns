package com.dilshan.designPatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HardDisk {
    public void loadHardDisk() {
        log.info("Loading Hard Disk...");
    }

    public void unloadHardDisk() {
        log.info("Unload Hard Disk...");
    }
}
