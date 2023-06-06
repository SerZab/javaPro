package summaryJavaIlia.lesson05_21042023;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();

        map.put(3,"B");
        map.put(4,"D");
        map.put(1,"A");
        map.put(2,"B");
        map.remove(1);
        map.put(1, "A");

        System.out.println(map.get(2));

        //Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer,String> st : map.entrySet()){
            System.out.println("Key : " + st.getKey() + ", value : " + st.getValue());
        }

        String text = "one one two hello word day two three hello mary hello hello one three word";

        Map<String,Integer> dict = new TreeMap<>();
        String[] strings = text.split("\\W");
        for (int i = 0; i < strings.length; i++) {
            String key = strings[i];
            if(dict.containsKey(strings[i])){
                dict.put(strings[i], dict.get(key) + 1);
            }else {
                dict.put(key, 1);
            }
        }
//        Queue<Word> queueCount = new PriorityQueue<>();
//        for (Map.Entry<String,Integer> word : dict.entrySet()){
//            System.out.println(word);
//            queueCount.add(new Word(word.getValue(),word.getKey()));
//        }

        List<Word> wordList = new ArrayList<>();
        for (Map.Entry<String,Integer> word : dict.entrySet()){
            wordList.add(new Word(word.getValue(),word.getKey()));
        }
        wordList.sort(Word::compareTo);
        for (Word w : wordList){
            System.out.println(w);
        }

//        int n = queueCount.size();
//        for (int i = 0; i < n; i++) {
//            System.out.println(queueCount.poll());
//        }

    }
    public static class Word implements Comparable<Word>{
        int count;
        String value;

        public Word(int count, String value) {
            this.count = count;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Word{" +
                    "count=" + count +
                    ", value='" + value + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Word o) {
            return o.count - count;
        }
    }
}
