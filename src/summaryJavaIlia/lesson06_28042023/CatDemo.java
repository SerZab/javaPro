package summaryJavaIlia.lesson06_28042023;

import java.util.Arrays;
import java.util.List;

// 1. Отсортировать с помощью стримов список из строк
//- по алфавиту
//- в обратном порядке
//2. Из списка чисел типа Integer с помощью стримов создать список их строковых представлений
//3. Создать класс Cat с полями
//String name
//int age
//String colour
//boolean isHungry
//Создать список из экземплянов класса Cat. С помощью стримов:
//- вывести список голодных кошек старше 2 лет
//- вывести список черных кошек с именем, начинающимся на T
//- вывести список имен кошек возраста 1 год

// Task:
//
//1. Посчитать количество неповторяющихся слов в списке
//2. Посчитать количество людей с именем "Tom" в списке имен
//3. Из списка имен вывести первое по алфавиту
//4. Посчитать количество чисел от 1 до 1000, которые делятся на 7.
//5. Посчитать сумму квадратов чисел от 1 до 10
//6. Дан список слов "Specific" "Measurable" "Achievable" "Relevant" "Time-bound".
// С помощью стримов вывести его аббревиатуру в виде S.M.A.R.T.

public class CatDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 2, "Black", true);
        Cat cat2 = new Cat("Tom", 3, "Black", true);
        Cat cat3 = new Cat("Murka", 1, "White", false);
        Cat cat4 = new Cat("Tim", 1, "Black", true);
        Cat cat5 = new Cat("Maks", 4, "Gray", true);
        List<Cat> cats = Arrays.asList(cat1,cat2,cat3,cat4,cat5);
        System.out.println(cats);
        System.out.println("-------");
        System.out.println(cats.stream().filter(cat -> (cat.isHungry && (cat.age>=2))).toList());
        System.out.println("------");
        System.out.println(cats.stream().filter(cat -> cat.colour=="Black" && cat.name.startsWith("T")).toList());
        System.out.println("------");
        System.out.println(cats.stream().filter(cat -> cat.age==1).toList());
//
//        List<Cat> blackCatsStartingWithT = cats.stream()
//                .filter(cat -> cat.getColour().equals("Black") && cat.getName().startsWith("T")).toList();
//        System.out.println("Список черных кошек с именем, начинающимся на T: " + blackCatsStartingWithT);
//        System.out.println("---");
//
//        List<String> oneYearOldCatNames = cats.stream().filter(cat -> cat.getAge() == 1).map(Cat::getName).toList();
//        System.out.println("Список имен кошек возраста 1 год: " + oneYearOldCatNames);
    }
}
