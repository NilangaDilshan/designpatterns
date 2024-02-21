package com.dilshan.designPatterns.behavioral.observer;

public interface Observer {
    void update();

    void subscribeChannel(Channel channel);
}
