package summaryJavaIlia.lesson08_12052023;

public class RunnableTask {
    static int a = 10;
    static int b = 10;

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Some task in progress ...");
            }
        };

        runnable.run();

        Runnable runnable1 = () -> System.out.println("Doing task 1");
        Runnable runnable2 = () -> System.out.println("Doing task 2");
        Runnable runnable3 = () -> System.out.println("Doing task 3");

        runnable2.run();
        new Thread(runnable3).start();
        new Thread(runnable1).start();


        Runnable runnableWithVariable = new Runnable() {
            @Override
            public void run() {
                a++;
                System.out.println(b);
            }
        };
        runnableWithVariable.run();
    }
}
