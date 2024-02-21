package com.dilshan.designPatterns.structural.adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StripeAdapter implements PaymentProcessor {
    private final StripeService stripeService;


    @Override
    public void processPayment(double amount) {
        this.stripeService.pay(amount);
    }
}
