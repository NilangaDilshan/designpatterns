package com.dilshan.designPatterns.latest.creational.factorymethod.message;

public abstract class Message {

    public abstract String getContent();

    public void addDefaultHeaders(){
        //Adds some default headers
    }
    public void encrypt(){
        //Encrypt the content
    }
}
