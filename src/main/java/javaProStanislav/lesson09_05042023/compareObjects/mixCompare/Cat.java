package javaProStanislav.lesson09_05042023.compareObjects.mixCompare;

import java.util.Objects;

public class Cat implements Comparable<Cat>{
    private String name;
    private int age;
    private String breed;

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, breed);
    }

    @Override
    public String toString() {
        return "CatExamples{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return getBreed().compareTo(o.getBreed());
    }
}
