package lessons.lesson06_27032023.shape.service;

import lessons.lesson06_27032023.shape.entity.Circle;
import lessons.lesson06_27032023.shape.entity.Rectangle;
import lessons.lesson06_27032023.shape.entity.Square;
import lessons.lesson06_27032023.shape.entity.Triangle;

public class CreateShape {
    public Circle createCircle(double radius){
        return new Circle("Circle", radius);
    }
    public Square createSquare (double side){
        return new Square("Square", side);
    }
    public Rectangle createRectangle(double sideA, double sideB){
        return new Rectangle("Rectangle", sideA, sideB);}

    public Triangle createTriangle(double side){
        return new Triangle("Triangle", side);
    }
}
