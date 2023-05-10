package homeWork.homeworkPractice_10052023;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HW8 {
    public static void main(String[] args) {
        /**
         * Дан двумерный массив строк, необходимо выбрать
         * все уникальные слова из массива и вернуть отсортированный
         * список слов в порядке убывания частоты их появления в массиве.
         */
        String[][] words = {{"apple", "orange", "pear", "orange"},
                {"orange", "pear", "pear", "apple"},
                {"apple", "orange", "orange", "pear"},
                {"orange", "pear", "apple", "pear"}};

        m8(words);
        System.out.println("------------");

        /**
         * Есть двумерный массив строк, представляющий таблицу данных,
         * где первый столбец - это имена, а остальные столбцы -
         * это числовые значения. Вам нужно написать программу,
         * которая найдет среднее значение для каждого числового
         * столбца, игнорируя строки, которые не могут быть преобразованы в числа.
         */
        String[][] data = {
                {"name1", "10", "20", "30"},
                {"name2", "40", "50", "not a number"},
                {"name3", "60", "70", "80"}
        };

        m9(data);
    }

    private static void m8(String[][] words) {
        Map<String,Long> wordCount = Arrays.stream(words)
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        List<String> uniqWords = wordCount.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(uniqWords);
    }

    private static void m9(String[][] data) {
        // Регулярное выражение для проверки, является ли строка числом
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        double[][] numericColumns = Arrays.stream(data)
                .map(row -> Arrays.stream(row)
                        .skip(1) // Пропускаем первый столбец с именами
                        .mapToDouble(value -> pattern.matcher(value).matches() ? Double.parseDouble(value) : 0.0) // Преобразуем в double, нечисловые значения заменяем на 0.0
                        .toArray())
                .toArray(double[][]::new);

        // Находим средние значения для каждого столбца
        double[] averages = new double[numericColumns[0].length];
        for (int i = 0; i < numericColumns[0].length; i++) {
            double sum = 0.0;
            int count = 0;
            for (double[] row : numericColumns) {
                if (i < row.length) {
                    sum += row[i];
                    count++;
                }
            }
            averages[i] = count > 0 ? sum / count : 0.0;
        }
        // Выводим результаты
        for (int i = 0; i < averages.length; i++) {
            System.out.printf("Среднее значение столбца %d: %.1f%n", i + 2, averages[i]);
        }
    }
}

