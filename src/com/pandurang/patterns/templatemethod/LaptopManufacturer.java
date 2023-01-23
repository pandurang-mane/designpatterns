package com.pandurang.patterns.templatemethod;

public class LaptopManufacturer extends ComputerManufacturer{
    @Override
    public String addHardDisk() {
        return "Laptop Computer with Hard Disk ";
    }

    @Override
    public String addRAM(String comp) {
        return comp+"and RAM ";
    }

    @Override
    public String addKeyboard(String comp) {
        return comp+"and Keyboard ";
    }
}
