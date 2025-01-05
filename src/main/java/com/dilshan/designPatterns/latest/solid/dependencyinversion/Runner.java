package com.dilshan.designPatterns.latest.solid.dependencyinversion;

public class Runner {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        ReportGenerator reportGenerator = new ReportGenerator(printer);
        reportGenerator.generateReport("This is a report");
    }
}
