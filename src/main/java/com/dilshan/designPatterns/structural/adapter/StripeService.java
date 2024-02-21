package com.dilshan.designPatterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StripeService {
    public void pay(double amount) {
        log.info("Payment processed via Stripe Service: {}", amount);
    }
}
