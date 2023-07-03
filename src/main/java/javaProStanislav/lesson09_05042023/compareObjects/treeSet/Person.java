package javaProStanislav.lesson09_05042023.compareObjects.treeSet;

import java.util.Objects;

public class Person implements Comparable<Person>{
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Person personForCompare) {
        int resultCompare = this.id - personForCompare.id;
        if (resultCompare == 0) {
            resultCompare = name.compareTo(personForCompare.name);
        }
        return resultCompare;
    }
}
