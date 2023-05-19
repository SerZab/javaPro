package practiceMihail.lesson18_16052023;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask {
    public static void main(String[] args) {
        String input = "Contact us at info@example.com or support@example.com";
        System.out.println(replace(input)); // Задача 1

        String phoneNumber = "+1-555-123-4567";
        System.out.println(check(phoneNumber)); // Задача 2

        String url = "https://www.example.com/path/to/page.html";
        System.out.println(isValidURL(url)); // Задача 3
    }
    /**
     *Задача 1 (Сложность 4/10):
     *Найти и заменить все email адреса в строке на "REDACTED".
     */

    private static String replace(String input) {
        String replacement = "REDACTED";
        //String regex = "\\w+@\\w+\\.[a-z]{3}";
        //String regex = "\\b[\\w.%-]+@[\\w.-]+\\.[A-Za-z]{2,4}\\b";
        String regex = "\\w+\\@\\w+.\\w{2,4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.replaceAll(replacement);
    }

    /**
     *Задача 2 (Сложность 6/10):
     *Проверить, является ли строка валидным номером телефона
     *в формате "+X-XXX-XXX-XXXX", где X - цифра.
     */

    private static boolean check(String phoneNumber) {
        String regex = "\\+\\d{1,3}-\\d{2,5}-\\d{2,5}-\\d{2,5}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    /**
     * Задача 3 (Сложность 8/10):
     * Проверить, является ли строка валидным URL-адресом,
     * начинающимся с "http://" или "https://",
     * и содержащим доменное имя и путь.
     */

    private static boolean isValidURL(String URL) {
        String regex = "^(http|https)://.*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(URL);
        return matcher.matches();
    }
}