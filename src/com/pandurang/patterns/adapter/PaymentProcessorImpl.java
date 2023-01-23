package com.pandurang.patterns.adapter;

public class PaymentProcessorImpl implements PaymentProcessor {
    @Override
    public String pay(int dollars) {
        return "Payment successfully completed for "+dollars+" dollars";
    }
}
