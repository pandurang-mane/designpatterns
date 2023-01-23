package com.pandurang.patterns.templatemethod;

public abstract class ComputerManufacturer {

    public void buildComputer(String comp) {
        System.out.println(comp+" built!!!");
    }
    public abstract String addHardDisk();
    public abstract String addRAM(String comp);
    public abstract String addKeyboard(String comp);
}
