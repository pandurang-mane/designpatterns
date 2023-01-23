package com.pandurang.patterns.templatemethod;

public class TestComputer {

    public static void main(String[] args) {
        ComputerManufacturer manufacturer = new LaptopManufacturer();
        String hardDisk = manufacturer.addHardDisk();
        String addRAM = manufacturer.addRAM(hardDisk);
        String addKeyboard = manufacturer.addKeyboard(addRAM);
        manufacturer.buildComputer(addKeyboard);
    }
}
