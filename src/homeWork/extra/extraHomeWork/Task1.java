package homeWork.extra.extraHomeWork;

import java.util.*;

public class Task1 {
    // Какие реализации интерфейса java.util.List вы знаете?
    // Напишите программу, которая демонстрирует создание разных списков.
    //PS: чем они отличаются друг от друга?

    public static void main(String[] args) {
        // Создание ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("один");
        arrayList.add("два");
        arrayList.add("три");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("-----------------------");

        // Создание LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("четыре");
        linkedList.add("пять");
        linkedList.add("шесть");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("-----------------------");

        // Создание Vector
        List<String> vector = new Vector<>();
        vector.add("семь");
        vector.add("восемь");
        vector.add("девять");
        System.out.println("Vector: " + vector);
        System.out.println("-----------------------");

        // Создание Stack
        Stack<String> stack = new Stack<>();
        stack.push("десять");
        stack.push("одиннадцать");
        stack.push("двенадцать");
        System.out.println("Stack: " + stack);
        System.out.println("-----------------------");

        // Создание HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("один", 1);
        hashMap.put("два", 2);
        hashMap.put("три", 3);
        System.out.println("HashMap: " + hashMap);
        System.out.println("-----------------------");

        // Создание TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("четыре", 4);
        treeMap.put("пять", 5);
        treeMap.put("шесть", 6);
        System.out.println("TreeMap: " + hashMap);
        System.out.println("-----------------------");

        // Создание TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("четыре");
        treeSet.add("пять");
        treeSet.add("шесть");
        System.out.println("TreeSet: " + treeSet);
        System.out.println("-----------------------");
        
        // Создание LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("семь");
        linkedHashSet.add("восемь");
        linkedHashSet.add("девять");
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
