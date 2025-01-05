package com.dilshan.designPatterns.latest.creational.factorymethod.message;

public class JsonMessage extends Message {

    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }
}
