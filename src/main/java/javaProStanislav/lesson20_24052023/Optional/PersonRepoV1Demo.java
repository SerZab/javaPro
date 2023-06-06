package javaProStanislav.lesson20_24052023.Optional;

import java.util.HashMap;
import java.util.Map;

public class PersonRepoV1Demo {
    public static void main(String[] args) {
        Map<Long,Person> ourDB = new HashMap<>();
        PersonRepo personRepo = new PersonRepo(ourDB);
    }
}
