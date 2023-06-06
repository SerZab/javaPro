package javaProStanislav.lesson16_10052023.streamPractice.flatMapExapmle3;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapExample3 {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("John",Arrays.asList("1","2","3","4")),
                new Person("Henry",Arrays.asList("5","6","1")),
                new Person("Mark",Arrays.asList("9","2","8")),
                new Person("Lara",Arrays.asList("9","10","1","2","3")),
                new Person("John",Arrays.asList("11","3","4","12")));

        System.out.println(findMaxCommonFriends(persons));

    }

    public static List<String> findMaxCommonFriends(List<Person> people) {
        Map<String, Integer> commonFriendsMap = new HashMap<>();
        for (int i = 0; i < people.size(); i++) {
            for (int j = i + 1; j < people.size(); j++) {
                Set<String> commonFriends = new HashSet<>(people.get(i).getFriends());
                commonFriends.retainAll(people.get(j).getFriends());
                int numCommonFriends = commonFriends.size();
                if (numCommonFriends > 0) {
                    String key = people.get(i).getName() + " / " + people.get(j).getName();
                    commonFriendsMap.put(key, numCommonFriends);
                }
            }
        }
        return commonFriendsMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

}
