package javaProStanislav.lesson12_24042023.bracketChecker;

import java.util.Stack;

public class BracketChecker {
    public static void main(String[] args) {

        System.out.println(isCorrect("()")); // Правильное расположение скобок
        System.out.println(isCorrect("([{}])")); // Правильное расположение скобок
        System.out.println(isCorrect("({[})")); // Неправильное расположение скобок
        System.out.println(isCorrect("({[})")); // Неправильное расположение скобок
    }

    public static boolean isCorrect(String text) {

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            } else if (character == ')' || character == '}' || character == ']') {
                if (stack.isEmpty() || !isMatch(stack.pop(), character)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatch(char chOpen, char chClose) {
        return (chOpen == '(' && chClose == ')') ||
               (chOpen == '{' && chClose == '}') ||
               (chOpen == '[' && chClose == ']');
    }
}
