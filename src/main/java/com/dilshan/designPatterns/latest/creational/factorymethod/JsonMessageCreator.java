package com.dilshan.designPatterns.latest.creational.factorymethod;

import com.dilshan.designPatterns.latest.creational.factorymethod.message.JsonMessage;
import com.dilshan.designPatterns.latest.creational.factorymethod.message.Message;

public class JsonMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
