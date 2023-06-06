package javaProStanislav.lesson10_17042023.queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        int time = 100;

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < time; i++) {
            deque.add(i);
        }
        deque.addLast(100);
        deque.addFirst(-1);
        System.out.println(deque);
    }
}
