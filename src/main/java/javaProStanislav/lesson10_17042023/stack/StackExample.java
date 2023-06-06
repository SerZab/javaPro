package javaProStanislav.lesson10_17042023.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("I");
        stack.push("love");
        stack.push("Java");
        System.out.println(stack);
        String str = stack.peek();
        System.out.println(str);
        System.out.println(stack);

        System.out.println(stack.empty());
        System.out.println(stack.search("Java"));
    }
}
