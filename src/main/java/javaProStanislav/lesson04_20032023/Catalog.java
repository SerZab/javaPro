package javaProStanislav.lesson04_20032023;

public class Catalog {
    String description;
    Day currentDay;

    @Override
    public String toString() {
        return "Catalog{" +
                "description='" + description + '\'' +
                ", currentDay=" + currentDay +
                '}';
    }
}
