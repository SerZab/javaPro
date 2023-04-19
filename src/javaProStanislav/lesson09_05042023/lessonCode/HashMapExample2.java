package javaProStanislav.lesson09_05042023.lessonCode;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample2 {
    public static void main(String[] args) {
        // Создание HashMap с элементами
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Banana", 90);
        scores.put("Orange", 95);
        scores.put("Apple", 85);

        // Получение множества ключей
        Set<String> keys = scores.keySet();
        System.out.println("Keys list " + keys);

        // Удаление элемента по ключу
        scores.remove("Apple");
        scores.put("Mango", 100);

        System.out.println("Keys list " + keys);
        System.out.println("Map elements " + scores);

        // Итерация по ключам и проверка наличия элемента
        for (String key : keys) {
            System.out.println(key);
            if (scores.containsKey(key)) {
                System.out.println(key + ": " + scores.get(key));
            } else {
                System.out.println(key + " is no longer in the map.");
            }
        }
    }
}
