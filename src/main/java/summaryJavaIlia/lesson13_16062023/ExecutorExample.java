package summaryJavaIlia.lesson13_16062023;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        // Создание ExecutorService с фиксированным пулом из 5 потоков
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Отправка задач на выполнение
        for (int i = 0; i < 10; i++) {
            Runnable task = new MyTask(i);
            executor.execute(task);
        }

        // Завершение работы ExecutorService
        executor.shutdown();
    }

    static class MyTask implements Runnable {
        private int taskId;

        public MyTask(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
            // Выполнение задачи...
        }
    }
}
