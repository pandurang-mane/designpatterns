package com.pandurang.patterns.facade;

public class Test {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.processOrder("Macbook", 3);

    }
}
