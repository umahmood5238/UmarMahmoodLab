package com.company;

public class ETriangle extends Shape {
    private int side;

    public ETriangle(int side) {
        super("ETriangle");
        this.side = side;
    }

    @Override
    public double getArea() {
        return .5*1.73205*side;
    }

    @Override
    public double getPerimeter() {
        return side*3;
    }
}
