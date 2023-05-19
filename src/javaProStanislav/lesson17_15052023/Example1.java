package javaProStanislav.lesson17_15052023;


import java.util.Date;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Пример с переносом строк");
        System.out.printf("one%ntwo%nthree");
        System.out.println();

        System.out.println("Пример с логическим типом");
        System.out.printf("%b%n",null);
        System.out.printf("%B%n", false);
        System.out.printf("%B%n", 2);
        System.out.printf("%b%n", "text");

        System.out.println("Пример с текстовыми данными");
        System.out.printf("%50.15s","Hello World!");
        System.out.println();

        System.out.println("Пример с символами");
        System.out.printf("%s%n","a");
        System.out.printf("%S%n","a");
        System.out.println();

        int x = 100;
        System.out.printf("Print simple integer: x = %d\n",x);
        System.out.printf("Formatted to specific width: n = %.2f\n",Math.PI);

        float y = 3.14f;
        System.out.printf("Formatted to specific width: n = %.4f\n",y);

        System.out.println("Пример с датой");
        Date date = new Date();
        System.out.println(date);
        System.out.printf("hours %1$tH: minutes %1$tM: seconds: %1$tS%n", date);
        System.out.printf("%1$tA,%1$tB %1$tY %n", date);
        System.out.printf("%1$td : %1$tm : %1$tY, %1$tH:%1$tM:%1$tS %n", new Date());

    }
}
