package javaProStanislav.lesson20_24052023.Optional;

import java.util.Map;

public class PersonRepo {
    private final Map<Long, Person> persons;

    public PersonRepo(Map<Long, Person> persons) {
        this.persons = persons;
    }
    public Person findById(Long id){
        return persons.get(id);
    }

}
