package javaProStanislav.lesson23_07062023.multiThreadung;

public class UseThread {

    public static void main(String[] args) throws InterruptedException {
        
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10000);
                System.out.println("Hello World");
                System.out.println("Finished Thread");
            } catch (InterruptedException e) {
            }
        });
        System.out.println("Start program");
        System.out.println("Pause 5 sec");
        thread.start();
        Thread.sleep(5000);
        System.out.println("Finish program");
        
        int count = 0;
        for (int i = 0; i < 500000000; i++) {
            count++;
        }
    }
}
