package homeWork.summary.hw01_28042023;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTasks1 {
    
    public static void main(String[] args) {
        //1. Посчитать количество неповторяющихся слов в списке
        List<String> names = Arrays.asList("Sergey","Jane","Tom","Andrew","Katrin","Andrew","Sergey","Dmitrij","Tom");
        System.out.println(names.stream()
                .distinct()
                .count());
        System.out.println("------");

        //2. Посчитать количество людей с именем "Tom" в списке имен
        System.out.println(names.stream()
                .filter(cat -> cat == "Tom")
                .count());
        System.out.println("------");

        //3. Из списка имен вывести первое по алфавиту
        System.out.println(names.stream()
                .sorted(String::compareTo)
                .findFirst());
        System.out.println("------");

        //4. Посчитать количество чисел от 1 до 1000, которые делятся на 7.
        int[] numbers = new int[1000];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println(Arrays.stream(numbers)
                .filter(i -> i % 7 == 0)
                .count());
        System.out.println("------");

        //5. Посчитать сумму квадратов чисел от 1 до 10
        int sumSquare = IntStream.rangeClosed(1,10)
                .map(n -> n = n*n)
                .sum();
        System.out.println(sumSquare);
        System.out.println("------");

        //6. Дан список слов "Specific" "Measurable" "Achievable" "Relevant" "Time-bound".
        // С помощью стримов вывести его аббревиатуру в виде S.M.A.R.T.
        List<String> words = Arrays.asList("Specific", "Measurable", "Achievable", "Relevant", "Time-bound");
        System.out.println(words.stream()
                .map(word -> word.charAt(0)+".")
                .collect(Collectors.joining()));

    }
}
