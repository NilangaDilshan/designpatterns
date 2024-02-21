package com.dilshan.designPatterns.behavioral.observer;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Subscriber implements Observer {
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        log.info("Video uploaded: {}", name);
    }

    @Override
    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }
}
