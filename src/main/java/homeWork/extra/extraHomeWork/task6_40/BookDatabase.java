package homeWork.extra.extraHomeWork.task6_40;

import java.util.List;
import java.util.Optional;

public interface BookDatabase {
    Long save(Book book); // Task6
    boolean delete(Long bookId); // Task7
    boolean delete(Book book); // Task8
    Optional<Book> findById(Long bookId); // Task9
    List<Book> findByAuthor(String author); // Task10
    List<Book> findByTitle(String title); // Task11
    int countAllBooks(); // Task12
    void deleteByAuthor(String author); // Task13
    void deleteByTitle(String title); // Task14

}
