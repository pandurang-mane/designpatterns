package com.pandurang.patterns.templatemethod;

public class Test {
    public static void main(String[] args) {
        DataRenderer renderer = new CSVDataRenderer();
        renderer.render();
    }
}
