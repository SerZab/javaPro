package javaProStanislav.lesson09_05042023.lessonCode;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample3 {
    public static void main(String[] args) {
        // Создание HashMap с элементами
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Banana", 90);
        scores.put("Orange", 95);
        scores.put("Apple", 85);

        // замена элемента по ключу

        scores.replace("Apple", 100);

        System.out.println(scores);

        for (Map.Entry<String,Integer> entry : scores.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }

    }
}
