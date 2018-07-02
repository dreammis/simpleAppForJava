package com.old.time.InterfaceI;


public class Rect implements Shape {
    private double width;
    private double height;

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
