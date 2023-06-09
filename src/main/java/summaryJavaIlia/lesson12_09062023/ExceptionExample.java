package summaryJavaIlia.lesson12_09062023;

public class ExceptionExample {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Special " + e.getMessage());
            }
        });

        Thread thread1 = new Thread(new Task());
        Thread thread2 = new Thread(new Task());
        thread1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Special " + e.getMessage());
            }
        });
        thread1.start();
        thread2.start();

        throw new RuntimeException("Some error in " + Thread.currentThread().getName());

    }
    static class Task implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " works");
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            throw new RuntimeException("Some error in " + Thread.currentThread().getName());
        }
    }
}
