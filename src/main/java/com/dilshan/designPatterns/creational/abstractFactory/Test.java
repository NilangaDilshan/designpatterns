package com.dilshan.designPatterns.creational.abstractFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static void main(String[] args) {
        AbstractCompany asus = new AsusCompany();
        Gpu asusGpu = asus.createGpu();
        asusGpu.assemble();
        Monitor asusMonitor = asus.createMonitor();
        asusMonitor.assemble();

        AbstractCompany msi = new MsiCompany();
        Gpu msiGpu = msi.createGpu();
        msiGpu.assemble();
        Monitor msiMonitor = msi.createMonitor();
        msiMonitor.assemble();
    }
}
