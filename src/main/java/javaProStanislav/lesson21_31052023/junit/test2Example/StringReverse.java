package javaProStanislav.lesson21_31052023.junit.test2Example;

public class StringReverse {
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "ABBA sing song";
        System.out.println(reverseString(input));
    }

}
