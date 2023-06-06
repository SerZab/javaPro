package javaProStanislav.lesson06_27032023.shape.core;

import javaProStanislav.lesson06_27032023.shape.entity.Shape;
import javaProStanislav.lesson06_27032023.shape.service.ShapeUtil;

import java.util.List;

public class ShapeCore {
    public void run(){
        ShapeUtil shapeUtil = new ShapeUtil();
        List<Shape> randomShapeList = shapeUtil.createRandomShapeList(10, 50);


        for (int i = 0; i < randomShapeList.size(); i++) {
            System.out.println("Our shape: ");
            System.out.println(randomShapeList.get(i));
            System.out.println("Shape area: " + randomShapeList.get(i).calculateArea());
            System.out.println("Shape perimeter: " + randomShapeList.get(i).calculatePerimeter());
        }


        System.out.println("Our shapes areas: " + shapeUtil.CalculateTotalShapesArea(randomShapeList));
        System.out.println("Our shapes perimeter: " + shapeUtil.CalculateTotalShapesPerimeter(randomShapeList));


    }

}
