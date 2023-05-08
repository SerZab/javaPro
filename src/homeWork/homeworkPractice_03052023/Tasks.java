package homeWork.homeworkPractice_03052023;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks {
    public static void main(String[] args) {
    // написать программу на Java, которая на вход получает массив строк и проверяет, есть ли среди них хотя бы одна строка,
    // содержащая только цифры. Если есть, то программа должна вернуть эту строку, иначе - вернуть null.

        String[] str = {"abc", "123", "def", "456"};
        System.out.println(containsDigits(str)); // 123

    // написать программу на Java, которая считывает текстовый файл заменяет в нем все вхождения слова "???"
    // на слово "вырезано цензурой" и сохраняет изменения в тот же файл
        String str1 = "Блины - это одно из самых популярных и любимых блюд в России. " +
                "Это тонкие лепешки из теста, обычно приготовленные на сковороде, которые можно подавать как в сладкой, " +
                "так и в соленой форме. Блины могут быть начинены различными ингредиентами, такими как творог, яйца, " +
                "ветчина, грибы, овощи или фрукты, что делает их варианты приготовления бесконечными. " +
                "В России блины традиционно подаются на Масленицу - праздник, который отмечается неделю перед Великим " +
                "постом, и который связан с обрядами выжигания чучела-масленицы и приготовления блинов. " +
                "Независимо от того, как вы предпочитаете свои блины - сладкими или солеными, с начинкой или без, " +
                "это блюдо всегда будет любимым и незабываемым угощением для всех";
        String strNew = Arrays.stream(str1.split(" "))
                .map(word-> word.equals("Блины") ? "'Вырезано цензурой'" : word)
                .map(word-> word.equals("блины") ? "'Вырезано цензурой'" : word)
                .collect(Collectors.joining(" "));
        System.out.println(strNew);

        //Напишите программу на Java, которая запрашивает у пользователя строку и выводит
        //на экран все уникальные слова в этой строке, отсортированные в алфавитном порядке.
        String userText = userInput("Введите пожалуйста строку: ");
        String[] text = userText.split("[\\s,.\"\'-]+");
        List<String> result = Arrays.stream(text)
                .map(s -> s.toLowerCase())
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(result);

        //Напишите программу на Java, которая запрашивает у пользователя текст, содержащий числа в формате
        // "число.число", и выводит на экран среднее арифметическое всех чисел в тексте.
        String userText1 = userInput("Введите пожалуйста строку: ");
        String[] text1 = userText.split(".");
        double v = Arrays.stream(text1).mapToDouble(Double::parseDouble)
                .average()
                .orElse(0);
        System.out.println(v);

    }
    public static String containsDigits(String[] strings) {
        return Arrays.stream(strings)
                .filter(s -> s.matches("\\d+")) // проверяем, содержит ли строка только цифры
                .findFirst() // получаем элемент из потока, удовлетворяющий условию
                .orElse(null); //иначе - вернуть null.
    }
    public static String userInput(String str){
        Scanner scanner = new Scanner(System.in);
        System.out.print(str);
        String strUser = scanner.nextLine();
        return strUser;
    }
}
