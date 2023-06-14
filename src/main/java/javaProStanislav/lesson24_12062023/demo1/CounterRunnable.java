package javaProStanislav.lesson24_12062023.demo1;

public class CounterRunnable implements Runnable{
    int count = 0;

    @Override
    public void run(){
        for (int i = 0; i < 1000_000; i++) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
