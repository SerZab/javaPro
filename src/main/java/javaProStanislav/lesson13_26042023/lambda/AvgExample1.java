package javaProStanislav.lesson13_26042023.lambda;

public class AvgExample1 {
    public static void main(String[] args) {
        IAvarage ref;
        ref = (a, b, c) -> (a + b + c)/3.0;

        System.out.println(ref.avg(3,4,5));
    }
}
