package homeWork.extraHomeWork;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task6 implements BookDatabase{
        // Создайте интерфейс BookDatabase и объявите в нём один метод:
        //    Long save(Book book);
        //Этот метод предназначен для сохранения книг в базу данных.
        //При сохранении каждой книге даётся уникальный номер (id).
        //Id это целое число. Первая в базе книга получает значение id = 1,
        //вторая id = 2 и так далее (автоинкремент - для каждой следующей книги
        //значение id просто увеличивается на единицу). Id присваивается в момент
        //сохранения книги в базу данных и больше никогда не меняется.
        //
        //Создайте класс BookDatabaseImpl, который реализует интерфейс BookDatabase.
        //Реализуйте в нём метод  Long save(Book book). Книги внутри класса BookDatabaseImpl
        //храните в списке.

        public static void main(String[] args) {
            Task6 task6 = new Task6();
            Book book1 = new Book("Лев Толстой", "Война и Мир");
            Long id1 = task6.save(book1);
            System.out.println("id 1: " + id1 + " - " + book1); // должно быть 1

            Book book2 = new Book("Михаил Булгаков", "Мастер и Маргарита");
            Long id2 = task6.save(book2);
            System.out.println("id 2: " + id2+ " - " + book2); // должно быть 2

            Book book3 = new Book("Николай Гоголь", "Мёртвые души");
            Long id3 = task6.save(book3);
            System.out.println("id 3: " + id3+ " - " + book3); // должно быть 3

            Book book4 = new Book("Илья Ильф, Евгений Петров", "Двенадцать стульев");
            Long id4 = task6.save(book4);
            System.out.println("id 4: " + id4+ " - " + book4);
        }
    List<Book> bookList = new ArrayList<>();
    Long nextId = 1L;
    @Override
    public Long save(Book book) {
        book.setId(nextId);
        bookList.add(book);
        nextId++;
        return book.getId();
    }
}
interface BookDatabase{
    Long save(Book book);
}
@ToString
class Book {
    private Long id;
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
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
        Book book = (Book) o;
        return id.equals(book.id) && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }
}
