package com.dilshan.designPatterns.latest.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        printMessage(new TextMessageCreator());
        printMessage(new JsonMessageCreator());
    }

    private static void printMessage(MessageCreator messageCreator){
        log.info("Message: {}", messageCreator.getMessage().getContent());
    }
}
