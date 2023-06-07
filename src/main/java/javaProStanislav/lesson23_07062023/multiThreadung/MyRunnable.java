package javaProStanislav.lesson23_07062023.multiThreadung;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("I'm Thread, my name is " + Thread.currentThread().getName());
    }
}
