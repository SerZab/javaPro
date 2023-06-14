package javaProStanislav.lesson24_12062023;

public class ThreadLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Thread " + Thread.currentThread().getName()));
        thread.start();
    }
}
