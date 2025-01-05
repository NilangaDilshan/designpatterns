package com.dilshan.designPatterns.latest.solid.dependencyinversion;

//High level module
public class ReportGenerator {

    private final Printer printer;

    public ReportGenerator(Printer printer) {
        this.printer = printer;
    }

    public void generateReport(String text){
        printer.print(text);
    }
}
