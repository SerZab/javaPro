package lessons.lesson04_20032023;

public class DaysDemo {
    public static void main(String[] args) {
        Day current = Day.Monday;
        Catalog catalog = new Catalog();
        catalog.currentDay = current;
        catalog.description = "Meeting about Java lesson";

        if (catalog.currentDay == Day.Sunday) {
            System.out.println(catalog);
        } else {
            System.out.println("Nothing todo");
        }
    }
}