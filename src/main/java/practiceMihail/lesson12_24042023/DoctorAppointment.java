package practiceMihail.lesson12_24042023;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DoctorAppointment {
    public static void main(String[] args) {
        
        Queue<String> queueDoctor = new LinkedList<>();

        // Создаем список доступных слотов
        String[] t = {"9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13-00", "13-30"};

        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя информацию о записи пациента
        System.out.print("Введите имя пациента: ");
        String name = scanner.nextLine();

        System.out.println("Выберите временной слот:");
        for (int i = 0; i < t.length; i++) {
            System.out.printf("%d - %s\n", i + 1, t[i]);
        }

        int slot = scanner.nextInt();

        // Добавляем запись пациента в очередь
        queueDoctor.offer(name + " " + t[slot - 1]);

        // Выводим информацию о записи пациента
        System.out.printf("Пациент %s записан на %s.\n", name, t[slot - 1]);

        // Пока очередь не пуста, выводим следующего пациента из очереди врачу
        while (!queueDoctor.isEmpty()) {
            String nextPatient = queueDoctor.poll();
            System.out.printf("Следующий пациент: %s\n", nextPatient);
        }
    }
}