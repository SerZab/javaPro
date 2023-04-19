package javaProStanislav.lesson10_17042023.queue;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        int time = 100;
        Collection<Integer> collection = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < time; i++) {
            queue.add(i);
        }
        System.out.println(queue);

        queue.add(100);

        while (!queue.isEmpty()){
            queue.poll();
            System.out.println(queue);
        }
        System.out.println();
        System.out.println(queue);
    }
}
