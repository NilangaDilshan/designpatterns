package com.dilshan.designPatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ComputerFacade {
    private final HardDisk hardDisk;
    private final Cpu cpu;
    private final Memory memory;

    public ComputerFacade() {
        this.hardDisk = new HardDisk();
        this.cpu = new Cpu();
        this.memory = new Memory();
    }

    public void startComputer() {
        this.cpu.startCpu();
        this.memory.loadMemory();
        this.hardDisk.loadHardDisk();
        log.info("Starting Computer...");
    }

    public void shutdownComputer() {
        this.hardDisk.unloadHardDisk();
        this.memory.unloadMemory();
        this.cpu.shutdownCpu();
        log.info("Shutting Down Computer...");
    }
}
