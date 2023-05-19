package homeWork.summary.hw01_28042023;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;


public class StreamTasks {
    public static void main(String[] args) {
        // 1. Отсортировать с помощью стримов список из строк
        //- по алфавиту и в обратном порядке

        List<String> names = Arrays.asList("Jane", "Tomas", "Katrin", "Andrew", "Sergej", "Dmitrij");
        System.out.println(names.stream()
                .sorted()
                .toList());
        System.out.println(names.stream()
                .sorted(Comparator.reverseOrder())
                .toList());
        System.out.println("-----------");

        //2. Из списка чисел типа Integer с помощью стримов создать список их строковых представлений
        // еще и сортанул и избавился от дублей (строки странно сортирует, сперва 100, потом 2)
        List<Integer> numbers = Arrays.asList(9,1,34,2,5,4,6,8,7,-5,100,5);
        System.out.println(numbers.stream()
                .map(Objects::toString)
                .sorted()
                .distinct()
                .toList());
        System.out.println("------");
        //3. Создать класс CatExamples с полями String name, int age, String colour, boolean isHungry
        //  Создать список из экземплянов класса CatExamples. С помощью стримов:

        Cat cat1 = new Cat("Barsik", 2, "Black", true);
        Cat cat2 = new Cat("Tom", 3, "Gray", false);
        Cat cat3 = new Cat("Murka", 1, "White", false);
        Cat cat4 = new Cat("Tim", 1, "Black", true);
        Cat cat5 = new Cat("Maks", 4, "Gray", true);
        List<Cat> cats = Arrays.asList(cat1,cat2,cat3,cat4,cat5);

        //- вывести список голодных кошек старше 2 лет
        System.out.println(cats.stream()
                .filter(cat -> (cat.isHungry() && (cat.getAge()>=2)))
                .toList());
        System.out.println("------");

        //- вывести список черных кошек с именем, начинающимся на T
        System.out.println(cats.stream()
                .filter(cat -> cat.getColour()=="Black" && cat.getName()
                        .startsWith("T"))
                .toList());
        System.out.println("------");

        //- вывести список имен кошек возраста 1 год
        System.out.println(cats.stream()
                .filter(cat -> cat.getAge()==1)
                .toList());
    }
}