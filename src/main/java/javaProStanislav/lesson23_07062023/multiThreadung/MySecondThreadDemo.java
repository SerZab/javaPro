package javaProStanislav.lesson23_07062023.multiThreadung;

public class MySecondThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MySecondThread mySecondThread = new MySecondThread();
            mySecondThread.start();
        }
    }
}
