package homeWork.homeworkPractice02_29032023;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListDemo {
    public static void main(String[] args) {

        // 1. Создать лист  А из 12 рандомных char
        List<Character> A = generateRandomList(12);
        System.out.println("List A: " + A);

        // 2. Создать стрингу В из 4 символов
        String B = generateRandomString(4);
        System.out.println("String B: " + B);

        // 3. Написать метод который проверяет можно ли составить из А слово В ,
        // причем если в стринге буквы повторяются то они должны повторяться и в листе
        System.out.println("Можно ли составить из лицта А слово В: " + canFormWord(A, B));
    }

    // метод который проверяет можно ли составить из А слово В
    public static boolean canFormWord(List<Character> A, String B) {
        for (char c : B.toCharArray()) {
            if (!A.contains(c)) {
                return false;
            }
            A.remove((Character) c);
        }
        return true;
    }
    // метод генерирует стрингу Стрингбилдерон
    public static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char) (Math.random() * 33 + 'а');
            sb.append(c);
        }
        return sb.toString();
    }
    // генерируем лист из рандомных char
    public static List<Character> generateRandomList(int length) {
        List<Character> A = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            char c = (char) (Math.random() * 33 + 'а');
            A.add(c);
        }
        return A;
    }
}
