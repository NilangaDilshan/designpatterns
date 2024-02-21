package com.dilshan.designPatterns.structural.adapter;

import lombok.Setter;

@Setter
public class ECommercePlatform {

    private PaymentProcessor paymentProcessor;

    public void checkout(double amount) {
        this.paymentProcessor.processPayment(amount);
    }
}
