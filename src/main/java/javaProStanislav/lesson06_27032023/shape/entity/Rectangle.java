package javaProStanislav.lesson06_27032023.shape.entity;

public class Rectangle extends Shape{
    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA*sideB;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(sideA+sideB);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
