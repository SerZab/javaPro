package javaProStanislav.test3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ConsoleApp {
    public static void main(String[] args) {
        try {
            // Вычисление и вывод результатов
            long result1 = 10L / 4;
            long result2 = 10L / 2;
            long result3 = 10L / 0;
            System.out.println("Результат 1: " + result1);
            System.out.println("Результат 2: " + result2);
            System.out.println("Результат 3: " + result3);
        } catch (ArithmeticException e) {
            // Обработка исключений
            String errorMessage = "Произошло деление на ноль";
            System.err.println(errorMessage);
            writeToLogFile(errorMessage);
        }
    }

    private static void writeToLogFile(String message) {
        try (FileWriter fileWriter = new FileWriter("err.log", true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(message);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл err.log: " + e.getMessage());
        }
    }
}
