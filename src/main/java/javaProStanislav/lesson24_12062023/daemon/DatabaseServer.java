package javaProStanislav.lesson24_12062023.daemon;

public class DatabaseServer implements Runnable{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(600000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
