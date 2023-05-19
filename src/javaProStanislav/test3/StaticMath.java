package javaProStanislav.test3;

import java.util.function.DoubleUnaryOperator;

public class StaticMath {
    public static double square(double x) {
        return x * x;
    }

    public static double linear(double x) {
        return 3 * x + 5;
    }

    public static double reciprocal(double x) {
        return 1 / x;
    }

    public static double cube(double x) {
        return x * x * x;
    }

    public static double absolute(double x) {
        return Math.abs(x);
    }

    public static void test(DoubleUnaryOperator function) {
        for (int x = -10; x < -1; x++) {
            double result = function.applyAsDouble(x);
            System.out.println("x = " + x + ", y = " + result);
        }
    }

    public static void main(String[] args) {
        test(StaticMath::square);
        test(StaticMath::linear);
        test(StaticMath::reciprocal);
        test(StaticMath::cube);
        test(StaticMath::absolute);
    }
}
