package com.pandurang.patterns.adapter;

public class PaymentApp {

    public String pay(int rupees) {
        PaymentAdapter adapter = new PaymentAdapter();
        return adapter.pay(rupees);
    }

    public static void main(String[] args) {
        PaymentApp paymentApp = new PaymentApp();
        System.out.println(paymentApp.pay(2000));
    }
}
