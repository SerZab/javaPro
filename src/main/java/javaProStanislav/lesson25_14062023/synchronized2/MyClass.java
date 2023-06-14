package javaProStanislav.lesson25_14062023.synchronized2;

public class MyClass {
    private int x;

    private int y;
    private static int result;

    public void printData() {
        System.out.println(x);
    }

    public synchronized void incrementY() {
        y++;
    }

    public synchronized void decrementX() {
        x--;
    }

    public synchronized static void sumXY(){
        result = 0;
    }
}
