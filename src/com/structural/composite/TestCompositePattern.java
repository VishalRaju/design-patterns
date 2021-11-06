package com.structural.composite;

public class TestCompositePattern {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape triangle1 = new Triangle();

        Drawing drawing = new Drawing();
        drawing.add(circle);
        drawing.add(triangle);
        drawing.add(triangle1);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(circle);
        drawing.draw("Green");

    }
}
