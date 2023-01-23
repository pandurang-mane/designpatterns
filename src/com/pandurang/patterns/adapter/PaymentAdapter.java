package com.pandurang.patterns.adapter;

public class PaymentAdapter {
    String pay(int rupees) {
        int dollar = rupees / 82;
        PaymentProcessor processor = new PaymentProcessorImpl();
        return processor.pay(dollar);
    }
}
