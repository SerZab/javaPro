package lessons.lesson06_27032023.shape.tests;

import lessons.lesson06_27032023.shape.entity.Square;

public class SquareTest {
    public static void main(String[] args) {
        int sideA = 10;

        String title = "Square";

        Square square = new Square(title,sideA);

        double expectedAreaResult = 100;
        double realAreaResult = square.calculateArea();
        double expectedPerimeter = 40;
        double realPerimeterResult = square.calculatePerimeter();

        printTestResult("Square calculate area", expectedAreaResult, realAreaResult);

        printTestResult("Square calculate perimeter", expectedPerimeter, realPerimeterResult);
    }

    public static void printTestResult(String message, double expectedResult, double realResult){
        if (expectedResult == realResult) {
            System.out.println("Test " + message + " passed OK!");
        } else {
            System.out.println("Test " + message + " passed FAIL!");
            System.out.println("Expected result " + expectedResult + ", but real result is - " + realResult);
        }
    }
}
