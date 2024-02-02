package com.dilshan.designPatterns.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IOS implements OS {
    @Override
    public String getName() {
        log.info("IOS get name");
        return "IOS";
    }

    @Override
    public Double getVersion() {
        log.info("IOS get version");
        return 2.0;
    }
}
