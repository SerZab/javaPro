package javaProStanislav.lesson13_26042023.lambdaExamples;

public class LambdaExample {
    public static void main(String[] args) {

        StringConvert stringConvert = (text) -> text.toUpperCase();

        String myText = "Hello, World!";

        String result1 = stringConvert.convert(myText);

        System.out.println(result1);

        stringConvert = (text) -> text.toLowerCase();

        String result2 = stringConvert.convert(myText);
        
        System.out.println(result2);
    }
}
