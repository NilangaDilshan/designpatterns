package com.dilshan.designPatterns.behavioral.observer;

public interface Subject {
    void subscribe(Subscriber subscriber);

    void upload(String title);

    void unSubscribe(Subscriber subscriber);

    void notifySubscribers();
}
