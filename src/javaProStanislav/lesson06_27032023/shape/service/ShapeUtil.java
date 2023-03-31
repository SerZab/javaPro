package javaProStanislav.lesson06_27032023.shape.service;

import javaProStanislav.lesson06_27032023.shape.entity.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeUtil {
    private Shape createRandomShape(int range){
        CreateShape createShape = new CreateShape();
        Random random = new Random();

        int randomChoice = random.nextInt(4);

        if (randomChoice == 0) {
            return createShape.createCircle(random.nextInt(range)+1);
        } else  if (randomChoice == 1) {
            return createShape.createRectangle(random.nextInt(range)+1,random.nextInt(range)+1);
        } else  if (randomChoice == 2) {
            return createShape.createSquare(random.nextInt(range)+1);
        } else  {
            return createShape.createTriangle(random.nextInt(range)+1);
        }
    }

    public List<Shape> createRandomShapeList(int numbersOfShapes, int range){
        List<Shape> randomShapeList = new ArrayList<>();
        for (int i = 0; i < numbersOfShapes; i++) {
            randomShapeList.add(createRandomShape(range));
        }
        return randomShapeList;
    }

    public double CalculateTotalShapesArea(List<Shape> shapes){
        double allShapesArea = 0;
        for (Shape shape : shapes) {
            allShapesArea = allShapesArea + shape.calculateArea();
        }
        return allShapesArea;
    }
    public double CalculateTotalShapesPerimeter(List<Shape> shapes){
        double allShapesPerimeter = 0;
        for (Shape shape : shapes) {
            allShapesPerimeter = allShapesPerimeter + shape.calculatePerimeter();
        }
        return allShapesPerimeter;
    }

}