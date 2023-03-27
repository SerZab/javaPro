package lessons.lesson06_27032023.shape.entity;

import lessons.lesson06_27032023.shape.entity.Shape;

public class Square extends Shape {
    private double sideA;

    public Square(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }

    @Override
    public double calculateArea() {
        return sideA*sideA;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(sideA+sideA);
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                '}';
    }
}
