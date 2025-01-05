package com.dilshan.designPatterns.latest.solid.dependencyinversion;

//Low level module
public class ConsolePrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
