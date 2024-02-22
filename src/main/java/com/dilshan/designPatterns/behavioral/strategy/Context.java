package com.dilshan.designPatterns.behavioral.strategy;

public class Context {
    private final Strategy operation;

    public Context(Strategy operation) {
        this.operation = operation;
    }

    public double executeOperation(double input1, double input2) {
        return this.operation.doOperation(input1, input2);
    }
}
