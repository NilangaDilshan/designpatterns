package com.dilshan.designPatterns.creational.prototype;

public interface Shape extends Cloneable {
    Shape clone();

    void draw();
}
