package homeWork.practice.hw06_17052023;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask {
    public static void main(String[] args) {

         // Задача 1 (Сложность 4/10):
         // Найти и заменить все email адреса в строке на "REDACTED".
        String input = "Contact us at info@example.com or support@example.com";
        System.out.println("1. " + replace(input));
        
        // Задача 2 (Сложность 6/10):
        // Проверить, является ли строка валидным номером телефона в формате "+X-XXX-XXX-XXXX", где X - цифра.

        String phoneNumber = "+1-555-123-4567";
        System.out.println("2. "+ check(phoneNumber));

        // Задача 3 (Сложность 8/10):
        // Проверить, является ли строка валидным URL-адресом, начинающимся с "http://" или "https://",
        // и содержащим доменное имя и путь.

        String url = "https://www.example.com/path/to/page.html";
        System.out.println("3. "+ isValidURL(url));

        // Задача 4 с уровнем сложности 4:
        // Напишите программу на Java, которая будет проверять, является ли заданная строка допустимым именем переменной.
        // Допустимые имена переменных должны начинаться с буквы или знака подчеркивания, а затем могут содержать любую
        // комбинацию букв, цифр и знаков подчеркивания. Минимальная длина имени переменной должна быть 2 символа.

        String[] vars = {"strNew", "_str", "abc", "ab", "123", "wrong variable", "a", "1ab", "!xgc"};
        isValid(vars);

        // Задача 1(5) (Уровень сложности: 5)
        // Проверить, является ли строка действительным IP-адресом формата IPv4.
        String ipAddress = "192.168.0.1";
        System.out.println("5(1). "+ isValidIP(ipAddress));

        // Задача 2(6) (Уровень сложности: 7)
        // Найти все даты в формате "DD-MM-YYYY" в заданной строке.

        String text = "Some text with dates: 01-01-2022, 31-12-2023, 15-02-2024";
        findDate(text);

        // Задача 3(7) с уровнем сложности 10:
        // Напишите программу на Java, которая будет парсить и анализировать структуру HTML-документа.
        // Вам нужно найти все ссылки (<a> теги) в HTML-коде и вывести их атрибуты href и текст ссылки.

        pars("<html><body><a href=\"https://www.google.com\">Google</a></body></html>");

        // Задача 4(8)
        // Написать программу, которая ищет все файлы определенного расширения на вашем компьютере(pdf)
        
        String directory = "/Users/serg/Downloads/"; // путь к корневой директории
        String extension = "pdf"; // файлы типа
        List<String> files = searchFiles(directory, extension);
        int count = 1;
        for(String file : files){
            System.out.println("8(4). Файл "+ count+ " ("+ extension + ") : " + file);
            count++;
        }
    }

    private static String replace(String input) {
        String replacement = "REDACTED";
        //String regex = "\\w+@\\w+\\.[a-z]{3}";
        //String regex = "\\b[\\w.%-]+@[\\w.-]+\\.[A-Za-z]{2,4}\\b";
        String regex = "\\w+\\@\\w+.\\w{2,4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.replaceAll(replacement);
    }
    private static boolean check(String phoneNumber) {
        String regex = "\\+\\d{1,3}-\\d{2,5}-\\d{2,5}-\\d{2,5}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    private static boolean isValidURL(String URL) {
        String regex = "^(http|https)://.*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(URL);
        return matcher.matches();
    }
    private static boolean isValid(String[] vars) {
        String regex = "^[a-zA-Z_][a-zA-Z0-9_]{1,}$";
        Pattern pattern = Pattern.compile(regex);
        for (String var : vars) {
            boolean isVal = pattern.matcher(var).matches();
            System.out.println("4. "+var + " is " + (isVal ? "valid" : "invalid"));
        }
        return true;
    }
    private static boolean isValidIP(String IP) {
        String regex = "\\d{3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(IP);
        return matcher.matches();
    }

    private static void findDate(String text) {
        String regex = "\\d{2}-\\d{2}-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println("6(2)."+text.substring(matcher.start(), matcher.end()));
        }
    }

    private static void pars(String html) {
        Pattern LINK_PATTERN = Pattern.compile("<a\\s+href\\s*=\\s*\"([^\"]*)\"[^>]*>(.*?)</a>",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = LINK_PATTERN.matcher(html);

        while (matcher.find()) {
            String href = matcher.group(1);
            String text = matcher.group(2);
            System.out.println("7(3). Текст ссылки: " + text + ", ссылка (" + href + ")");
        }
    }

    private static List<String> searchFiles(String dom, String ext) {
        List<String> foundFiles = new ArrayList<>();

        File folder = new File(dom);
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(ext)) {
                    foundFiles.add(file.getAbsolutePath());
                }
            }
        }

        return foundFiles;
    }
}
