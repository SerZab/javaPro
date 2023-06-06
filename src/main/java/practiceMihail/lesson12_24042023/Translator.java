package practiceMihail.lesson12_24042023;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {
    private static Map<String, String> dictionary = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите слово на английском языке: ");
            String word = scanner.nextLine();

            if (dictionary.containsKey(word)) {
                System.out.println("Перевод: " + dictionary.get(word));
            } else {
                System.out.print("Слово не найдено в словаре. Введите перевод: ");
                String translation = scanner.nextLine();
                dictionary.put(word, translation);
                System.out.println("Слово \"" + word + "\" и его перевод \"" + translation + "\" добавлены в словарь.");
            }
        }
    }
}
