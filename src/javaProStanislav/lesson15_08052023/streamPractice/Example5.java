package javaProStanislav.lesson15_08052023.streamPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Студент записывает книги которые прочитал, задача вывести все прочитанные книги у всех студентов (в качестве
дополнения, применить фильтр на любую тему)
 */

public class Example5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Aleks");
        student1.addBook("Java 8 vs Java 19");
        student1.addBook("Spring Boot in Action");
        student1.addBook("Effective Java");

        Student student2 = new Student();
        student2.setName("Thomas");
        student2.addBook("HTML introducing");
        student2.addBook("Effective Java");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);

        System.out.println(list.stream()
                .map(st -> st.getBook())
                .flatMap(x -> x.stream())
                .filter(book -> book.contains("Java"))
                .collect(Collectors.toSet()));
        
        System.out.println(list.stream()
                .flatMap(st -> st.getBook().stream())
                .filter(book -> !book.contains("HTML") && !book.contains("Spring")).toList());


    }
}

class Student {
    private int id;
    private String name;
    private Set<String> book;

    public void addBook(String book) {
        if (this.book == null)
            this.book = new HashSet<>();

        this.book.add(book);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getBook() {
        return book;
    }

    public void setBook(Set<String> book) {
        this.book = book;
    }
}
