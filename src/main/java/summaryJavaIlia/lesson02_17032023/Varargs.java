package summaryJavaIlia.lesson02_17032023;

public class Varargs {
    public static void myMethod(int ... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        myMethod();              // без аргументов
        myMethod(1);             // один аргумент
        myMethod(1, 2);          // два аргумента
        myMethod(1, 2, 3);       // три аргумента
        myMethod(1, 2, 3, 4, 5);
    }
}
