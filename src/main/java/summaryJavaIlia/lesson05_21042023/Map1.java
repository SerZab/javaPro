package summaryJavaIlia.lesson05_21042023;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        String text = "one one two hello word day two three hello mary hello hello one three word";
        Map<String, Integer> mapText = new HashMap<>();

        String[] words = text.split("[\\s.,!?]+");
        for (String word : words) {
            if (!word.isEmpty()) {
                if (mapText.containsKey(word)) {
                    int count = mapText.get(word);
                    mapText.put(word, count + 1);
                } else {
                    mapText.put(word, 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> sortedWord = new ArrayList<>(mapText.entrySet());
        sortedWord.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (Map.Entry<String, Integer> entry : sortedWord) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
