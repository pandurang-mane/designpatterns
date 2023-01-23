package com.pandurang.patterns.templatemethod;

public class DesktopManufacturer extends ComputerManufacturer{
    @Override
    public String addHardDisk() {
        return "Desktop Computer with HardDisk ";
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
