package com.dilshan.designPatterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayPalService {
    public void charge(double amount) {
        log.info("Payment processed via PayPal: {}", amount);
    }
}
