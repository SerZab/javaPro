package javaProStanislav.lesson09_05042023.compareObjects.comparator;
import java.util.Objects;

public class PersonComparator{
    String name;
    int id;

    public PersonComparator(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonComparator person = (PersonComparator) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}
