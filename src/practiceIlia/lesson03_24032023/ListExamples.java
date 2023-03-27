package practiceIlia.lesson03_24032023;

import java.util.*;

public class ListExamples {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.subList(1,3));

        List<String> names = Arrays.asList("Marry", "Jane", "Tom", "Tim", "Mark", "Anna", null, "");

        for (String name : names) {
            System.out.println("student " + name);
        }
        System.out.println(getNamesFromLetter(names, 'T'));
        nCapsLock(names, 3);
    }

    public static List<String> getNamesFromLetter(List<String> names, char letter) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (name != null && name.startsWith(String.valueOf(letter))) {
//          if (name != null && name.toLowerCase().startsWith(letter.toLowerCase())) {
                result.add(name);
            }
        }
        return result;
    }
    public static void nCapsLock(List<String> names, int n) {
        for (String name : names) {
            if (name != null && name.length() > n) {
                System.out.println(name.toUpperCase());
            }
        }
    }
}
