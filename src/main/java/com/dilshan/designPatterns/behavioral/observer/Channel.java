package com.dilshan.designPatterns.behavioral.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Channel implements Subject {
    private String name;
    private List<Subscriber> subscribers = new ArrayList<>();
    private String title;

    public Channel(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void upload(String title) {
        this.title = title;
        this.notifySubscribers();
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        this.subscribers.forEach(Subscriber::update);
    }
}
