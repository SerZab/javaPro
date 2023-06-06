package javaProStanislav.lesson13_26042023.lambda;

public class AvgExample2 {
    public static void main(String[] args) {
        printAverage((a,b,c) ->(a+b+c)/3.0,3,7,8);
    }


    public static void printAverage(IAvarage ref, double a, double b,  double c){
        System.out.println(ref.avg(a,b,c));
    }
}
