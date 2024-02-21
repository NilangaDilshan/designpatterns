package com.dilshan.designPatterns.structural.facade;

public class FacadeTest {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();
        computerFacade.shutdownComputer();
    }
}
