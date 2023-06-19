package summaryJavaIlia.lesson13_16062023;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Создание ExecutorService с пулом из одного потока
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Отправка задач на выполнение с возвращением результатов
        Future<Integer> result1 = executor.submit(new MyTask(5));
        Future<Integer> result2 = executor.submit(new MyTask(10));

        // Получение результатов выполнения задач
        try {
            int sum = result1.get() + result2.get();
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Завершение работы ExecutorService
        executor.shutdown();
    }

    static class MyTask implements Callable<Integer> {
        private int taskId;

        public MyTask(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public Integer call() throws Exception {
            System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
            // Выполнение задачи и возврат результата
            return taskId * 2;
        }
    }
}


