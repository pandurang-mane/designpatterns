package com.pandurang.patterns.facade;

import java.awt.*;

public class OrderProcessor {
    public boolean checkStock(String stock) {
        System.out.println("Checking Stock");
        return true;
    }
    public String placeOrder(String name, int quantity) {
        System.out.println("Order Placed");
        return "abc123";
    }

    public void shipOrder(String orderId) {
        System.out.println("Order Shipped "+orderId);
    }
}
