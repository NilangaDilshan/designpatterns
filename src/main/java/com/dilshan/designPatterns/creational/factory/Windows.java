package com.dilshan.designPatterns.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Windows implements OS {
    @Override
    public String getName() {
        log.info("Windows get name");
        return "Windows";
    }

    @Override
    public Double getVersion() {
        log.info("Windows get version");
        return 3.0;
    }
}
