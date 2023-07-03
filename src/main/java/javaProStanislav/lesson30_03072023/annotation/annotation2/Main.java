package javaProStanislav.lesson30_03072023.annotation.annotation2;

public class Main {
    @SuppressWarnings(value = "deprecation")
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
