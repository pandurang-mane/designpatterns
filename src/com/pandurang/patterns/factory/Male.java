package com.pandurang.patterns.factory;

public class Male implements Person{
    @Override
    public void wish(String msg) {
        System.out.println("Thank god I am a Male person "+msg);
    }
}
