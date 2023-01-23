package com.pandurang.patterns.flyweight;

public class Circle extends Shape {

    private String label;

    public Circle() {
        label = "Circle";
    }

    @Override
    public void draw(int radius, String fillColor, String lineColor) {
        System.out.println("Drawing a "+label+" with radius "+radius+" fill color "+fillColor+" linecolor "+lineColor);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
