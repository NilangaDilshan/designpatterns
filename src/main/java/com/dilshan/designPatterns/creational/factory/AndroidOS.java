package com.dilshan.designPatterns.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AndroidOS implements OS {
    @Override
    public String getName() {
        log.info("Android OS get name");
        return "Android";
    }

    @Override
    public Double getVersion() {
        log.info("Android OS get version");
        return 1.0;
    }
}
