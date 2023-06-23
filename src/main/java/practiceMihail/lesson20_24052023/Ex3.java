package practiceMihail.lesson20_24052023;

public class Ex3 extends Thread{
    volatile Boolean b = true;

    @Override
    public void run(){
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Counter: "+ counter);
    }

    public static void main(String[] args) throws InterruptedException{
        Ex3 thread = new Ex3();
        thread.start();

        Thread.sleep(1500);
        System.out.println("After 1,5 sec....");

        thread.b = false;
        thread.join();

        System.out.println("PhaserExample1 end");
    }
}
