package com.dilshan.designPatterns.latest.creational.factorymethod;

import com.dilshan.designPatterns.latest.creational.factorymethod.message.Message;
import com.dilshan.designPatterns.latest.creational.factorymethod.message.TextMessage;

public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
