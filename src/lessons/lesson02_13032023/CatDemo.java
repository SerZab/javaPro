package lessons.lesson02_13032023;

import lessons.lesson02_13032023.incapsulation.Cat;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Murzik";
        cat.setId(1);
        cat.setBreed("terrier");
        cat.setAge(3);
        System.out.println(cat);
    }
}
