package practiceMihail.lesson06_27032023;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Palindrome {
    public static void main(String[] args) {
        String s = "ASSDDSSA";
        String d = "HELLO";
        String c = "123456654321";

        System.out.println(palindrome(s));
        System.out.println(palindrome(d));
        System.out.println(palindrome(c));
    }
    public static boolean palindrome(String s) {
        List<Character> chars = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                chars.add(ch);
            }
        }
        Iterator<Character> to = chars.iterator();
        ListIterator<Character> back = chars.listIterator(chars.size());
        for (int i = 0; i < chars.size() / 2; i++) {
            // сравниваем i-ый символ с последним символом
            if (to.hasNext() && back.hasPrevious() != to.next().equals(back.previous())) {
                return false;
            }
        }
        return true;
    }
}
