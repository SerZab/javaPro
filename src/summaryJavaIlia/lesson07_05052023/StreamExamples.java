package summaryJavaIlia.lesson07_05052023;


import homeWork.homeWorkSummary_28042023.Cat;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> integerStream = integerList.stream();
        //List<Integer> filteredList = integerStream.filter(integer -> integer % 2 == 0).toList();
        List<Integer> filteredList2 = integerStream.filter(i->i%3==0).toList();
        //System.out.println(filteredList);
        System.out.println(filteredList2);

        Cat cat1 = new Cat("Barsik", 2, "Black", true);
        Cat cat2 = new Cat("Tom", 3, "Gray", false);
        Cat cat3 = new Cat("Murka", 1, "White", false);
        Cat cat4 = new Cat("Tim", 1, "Black", true);
        Cat cat5 = new Cat("Maks", 4, "Gray", true);
        List<Cat> catList = Arrays.asList(cat1,cat2,cat3,cat4,cat5);

        List<Cat> white = catList.stream().filter(cat -> cat.getColour().equals("White")).toList();
        catList.get(1).setColour("Black");
        System.out.println(catList);

        IntStream intStream = IntStream.rangeClosed(1,1_000_000);
        intStream = intStream.map(i->i*i);
        //intStream.skip(5).peek(System.err::println).limit(10).forEach(System.out::println);
        List<Integer> integerList1 = intStream.mapToObj(value -> value).toList();

        System.out.println("----------");
        String words = "Mr. and Mrs. Dursley, of number four, Privet Drive, were proud to say\n" + "that they were perfectly normal, thank you very much. They were the last\n" + "people you'd expect to be involved in anything strange or mysterious,\n" + "because they just didn't hold with such nonsense.\n" + "Mr. Dursley was the director of a firm called Grunnings, which made\n" + "drills. He was a big, beefy man with hardly any neck, although he did\n" + "have a very large mustache. Mrs. Dursley was thin and blonde and had\n" + "nearly twice the usual amount of neck, which came in very useful as she\n" + "spent so much of her time craning over garden fences, spying on the\n" + "neighbors. The Dursleys had a small son called Dudley and in their\n" + "opinion there was no finer boy anywhere.\n" + "The Dursleys had everything they wanted, but they also had a secret, and\n" + "their greatest fear was that somebody would discover it. They didn't\n" + "think they could bear it if anyone found out about the Potters. Mrs.\n" + "Potter was Mrs. Dursley's sister, but they hadn't met for several years;\n" + "in fact, Mrs. Dursley pretended she didn't have a sister, because her\n" + "sister and her good-for-nothing husband were as unDursleyish as it was\n" + "possible to be. The Dursleys shuddered to think what the neighbors would\n" + "say if the Potters arrived in the street. The Dursleys knew that the\n" + "Potters had a small son, too, but they had never even seen him. This boy\n" + "was another good reason for keeping the Potters away; they didn't want\n" + "Dudley mixing with a child like that.\n" + "When Mr. and Mrs. Dursley woke up on the dull, gray Tuesday our story\n" + "starts, there was nothing about the cloudy sky outside to suggest that\n" + "strange and mysterious things would soon be happening all over the\n" + "country. Mr. Dursley hummed as he picked out his most boring tie for\n" + "work, and Mrs. Dursley gossiped away happily as she wrestled a screaming\n" + "Dudley into his high chair.\n" + "None of them noticed a large, tawny owl flutter past the window.\n" + "At half past eight, Mr. Dursley picked up his briefcase, pecked Mrs.\n" + "Dursley on the cheek, and tried to kiss Dudley good-bye but missed,";

        Map<String, Integer> dictionary = new TreeMap<>();
        String[] strings = words.split("\\W");

        System.out.println(strings.length);
        System.out.println(Arrays.stream(strings)
                .distinct()
                .count());

        List<Integer> list = Arrays.stream(strings)
                .flatMap(s -> s.chars()
                        .mapToObj(value -> value))
                .distinct().toList();
        System.out.println(list.size());


        int reduce = IntStream.rangeClosed(1, 3).reduce(2, (result, element) -> Math.max(result,element));
        System.out.println(reduce);


    }
}
