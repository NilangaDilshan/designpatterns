package com.dilshan.designPatterns.structural.adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PayPalAdapter implements PaymentProcessor {
    private final PayPalService payPalService;

    @Override
    public void processPayment(double amount) {
        this.payPalService.charge(amount);
    }
}
