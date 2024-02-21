package com.dilshan.designPatterns.structural.adapter;

public class Test {
    public static void main(String[] args) {
        ECommercePlatform eCommercePlatform = new ECommercePlatform();

        StripeService stripeService = new StripeService();
        StripeAdapter stripeAdapter = new StripeAdapter(stripeService);

        PayPalService payPalService = new PayPalService();
        PayPalAdapter payPalAdapter = new PayPalAdapter(payPalService);

        eCommercePlatform.setPaymentProcessor(stripeAdapter);
        eCommercePlatform.checkout(100);

        eCommercePlatform.setPaymentProcessor(payPalAdapter);
        eCommercePlatform.checkout(200);
    }
}
