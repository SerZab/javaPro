package javaProStanislav.lesson09_05042023.lessonCode;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        // Создание HashMap с элементами
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Banana", 90);
        scores.put("Orange", 95);
        scores.put("Apple", 85);

        // Итерация по ключам и значениям
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
