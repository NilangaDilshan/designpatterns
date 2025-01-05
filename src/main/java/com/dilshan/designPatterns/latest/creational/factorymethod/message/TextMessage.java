package com.dilshan.designPatterns.latest.creational.factorymethod.message;

public class TextMessage extends Message {

    @Override
    public String getContent() {
        return "Text";
    }
}
