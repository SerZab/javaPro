package practiceMihail.lesson20_24052023;

public class Example2 {
    public static void main(String[] args) {
       ThreadEx1 ex1 = new ThreadEx1();
       ThreadEx2 ex2 = new ThreadEx2();
       Thread thread = new Thread(()-> {
           for (int i = 0; i < 10; i++) {
               System.out.println("********");
           }
       });

       ex1.start();
       ex2.start();
       thread.start();
    }
}
class ThreadEx1 extends Thread{
    @Override
    public void run(){
        for (int i = 1; i < 10; i++) {
            System.out.println("Thread 1: "+i);
        }
    }
}
class ThreadEx2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2: "+i);
        }
    }
}
