package homeWork.extra.extraHomeWork;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Task5 {
    // Создайте класс BookListContainsDemo(Task5) в котором продемонстрируйте как
    // делают проверку есть ли в списке книга или её нет с помощью метода
    // contains(). Если для правильной работы метода contains() требуется
    // внести изменения в класс Book, сделайте это!
    
    public static void main(String[] args) {

        List<Book1> books = new ArrayList<>();

        Book1 book1 = new Book1("A1", "B1");
        Book1 book2 = new Book1("A2", "B2");

        books.add(book1);
        books.add(book2);
        System.out.println(books);
        System.out.println("----------");

        Book1 bookInTheList = new Book1("A1", "B1");
        boolean containsBook = books.contains(bookInTheList); // должно быть true
        System.out.println(containsBook);
        System.out.println("----------");

        Book1 bookNotInTheList = new Book1("A3", "B3");
        boolean notContainsBook = books.contains(bookNotInTheList); // должно быть false
                // (отрабатывает правильно только после переопределения equals+hash)
        System.out.println(notContainsBook);

    }
}
class Book1 {
    private String title;
    private String author;

    Book1(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book1 book = (Book1) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}