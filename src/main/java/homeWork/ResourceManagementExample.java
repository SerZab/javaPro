package homeWork;

import java.util.concurrent.Semaphore;

public class ResourceManagementExample {
    private static final int N = 5; // Количество производителей
    private static final int M = 3; // Количество потребителей
    private static final int S = 10; // Размер склада

    private static Semaphore producersSemaphore = new Semaphore(S);
    private static Semaphore consumersSemaphore = new Semaphore(0);
    private static Semaphore mutexSemaphore = new Semaphore(1);
    private static int resourceCount = 0;

    public static void main(String[] args) {
        for (int i = 1; i <= N; i++) {
            int producerId = i;
            Thread producerThread = new Thread(() -> {
                while (true) {
                    try {
                        Thread.sleep(getRandomTime());
                        producersSemaphore.acquire(); // Ожидание разрешения на производство
                        mutexSemaphore.acquire(); // Получение доступа к ресурсу

                        // Производство ресурса
                        resourceCount++;
                        System.out.println(getLogMessage(producerId, resourceCount, "Ресурс произведен"));

                        mutexSemaphore.release(); // Освобождение ресурса
                        consumersSemaphore.release(); // Уведомление потребителей о появлении ресурса
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            producerThread.start();
        }

        for (int i = 1; i <= M; i++) {
            int consumerId = i;
            Thread consumerThread = new Thread(() -> {
                while (true) {
                    try {
                        consumersSemaphore.acquire(); // Ожидание появления ресурса на складе
                        mutexSemaphore.acquire(); // Получение доступа к ресурсу

                        // Потребление ресурса
                        System.out.println(getLogMessage(consumerId, resourceCount, "Ресурс потреблен"));
                        resourceCount--;

                        mutexSemaphore.release(); // Освобождение ресурса
                        producersSemaphore.release(); // Уведомление производителей о освобождении места на складе
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            consumerThread.start();
        }
    }

    private static long getRandomTime() {
        return (long) (Math.random() * 1000);
    }

    private static String getLogMessage(int threadId, int resourceId, String event) {
        String threadType = threadId <= N ? "Производитель" : "Потребитель";
        return String.format("Время: %s, Номер потока: %d, Тип: %s, Идентификатор ресурса: %d, Событие: %s",
                System.currentTimeMillis(), threadId, threadType, resourceId, event);
    }
}
