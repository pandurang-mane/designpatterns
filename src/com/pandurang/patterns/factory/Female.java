package com.pandurang.patterns.factory;

public class Female implements Person{
    @Override
    public void wish(String msg) {
        System.out.println("Thank god I am a Female person "+msg);
    }
}
