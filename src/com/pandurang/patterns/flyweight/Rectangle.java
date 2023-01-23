package com.pandurang.patterns.flyweight;

public class Rectangle extends Shape {

    private String label;

    public Rectangle() {
        label = "Rectangle";
    }

    @Override
    public void draw(int length, int breadth, String fillStyle) {
        System.out.println("Drawing a "+label+" with length "+length+" breadth "+breadth+" fillStyle "+fillStyle);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
