package javaProStanislav.lesson14_03052023.stream;

import java.util.stream.IntStream;

public class StreamExample2 {
    public static void main(String[] args) {
        int[] arr = {50,60,70,80,90,100,110,120};
        int count = 0;
        int sum = 0;
        for(int x : arr){
            if(x >= 90){
                x+=10;
                sum += x;
                count++;
                if (count > 3) break;
                System.out.println(x);
            }
        }
        System.out.println("===========");

        IntStream.of(50,60,70,80,90,100,110,120)
                .filter(x-> x >= 90)
                .map(x-> x +1)
                .limit(4)
                .forEach(System.out::println);
    }
}
