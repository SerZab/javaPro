package homeWork.homeWorkSummary_05052023;

import homeWork.homeWorkSummary_28042023.Cat;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CatExamples {
    public static void main(String[] args) {


        Cat cat1 = new Cat("Tom", 2, "black", true);
        Cat cat2 = new Cat("Mikky", 1, "white", false);
        Cat cat3 = new Cat("Vasya", 3, "white", true);
        Cat cat4 = new Cat("Steve", 1, "grey", false);
        Cat cat5 = new Cat("Bob", 2, "black", true);
        List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5);

        // 1. Получить Map<String, Boolean> имя / информация, голодна ли кошка
        Map<String, Boolean> nameIsHungry = catList.stream()
                .collect(Collectors.toMap(Cat::getName, Cat::isHungry));
        int count = 1;
        for(Map.Entry<String,Boolean> entry : nameIsHungry.entrySet()){
            System.out.println(count+". "+entry.getKey()+", isHungry: "+entry.getValue());
            count++;
        }
        System.out.println("-------------");
        // 2. Получить Map<String, Long> цвет / количество кошек данного цвета
        Map<String, Long> colorCount = catList.stream()
                .collect(Collectors.groupingBy(Cat::getColour, Collectors.summingLong(value -> 1)));
        for (Map.Entry<String,Long> entry : colorCount.entrySet()){
            System.out.println(count+". "+entry.getKey()+", count: "+ entry.getValue());
            count++;
        }
        System.out.println("-------------");
        // 3. Получить Map<String, Set<String>> цвет / список имен кошек данного цвета
        Map<String, Set<String>> colorNames = catList.stream()
                .collect(Collectors.groupingBy(Cat::getColour, Collectors.mapping(Cat::getName, Collectors.toSet())));
        for (Map.Entry<String,Set<String>> entry : colorNames.entrySet()){
            System.out.println(count+". color: "+entry.getKey()+", names: "+entry.getValue());
            count++;
        }
        System.out.println("-------------");
        // 4. Получить Map<Integer, Integer> возраст / количество голодных кошек данного возраста
        Map<Integer, Integer> ageIsHungry = catList.stream()
                .filter(Cat::isHungry)
                .collect(Collectors.groupingBy(Cat::getAge, Collectors.summingInt(e -> 1)));
        for (Map.Entry<Integer,Integer> entry : ageIsHungry.entrySet()){
            System.out.println(count+". age: "+entry.getKey()+", isHungry: "+entry.getValue());
            count++;
        }
        System.out.println("-------------");

        // Сам себе добавил задач!!!
        // 5. Получить Map<String, Set<Integer>> цвет / количество кошек по возрасту
        Map<String, Set<Integer>> colourAge = catList.stream()
                .collect(Collectors.groupingBy(Cat::getColour, Collectors.mapping(Cat::getAge, Collectors.toSet())));
        for (Map.Entry<String,Set<Integer>> entry : colourAge.entrySet()){
            System.out.println(count+". color: "+entry.getKey()+", age: "+entry.getValue());
            count++;
        }
        System.out.println("-------------");
        // 6. Получить Map<Integer, Set<String>> возраст / имена кошек
        Map<Integer, Set<String>> ageNames = catList.stream()
                .distinct()
                .collect(Collectors.groupingBy(Cat::getAge, Collectors.mapping(Cat::getName, Collectors.toSet())));
        for (Map.Entry<Integer,Set<String>> entry : ageNames.entrySet()){
            System.out.println(count+". age: "+entry.getKey()+", names: "+entry.getValue());
            count++;
        }
        System.out.println("-------------");
        // 7. Получить Map<Boolean, Set<String>> голодные/неголодные / имена кошек
        Map<Boolean, Set<String>> isHungryNames = catList.stream()
                .distinct()
                .collect(Collectors.groupingBy(Cat::isHungry, Collectors.mapping(Cat::getName, Collectors.toSet())));
        for (Map.Entry<Boolean,Set<String>> entry : isHungryNames.entrySet()){
            System.out.println(count+". isHungry: "+entry.getKey()+", names: "+entry.getValue());
            count++;
        }

    }

}
