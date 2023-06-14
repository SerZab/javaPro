package javaProStanislav.lesson24_12062023.synchroniz;

import java.util.List;

public class Counter {
    private int counter = 0;
    private String clientName;
    private List<String> clients;

    public synchronized void increment(){
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
