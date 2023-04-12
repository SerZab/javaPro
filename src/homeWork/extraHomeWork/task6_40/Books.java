package homeWork.extraHomeWork.task6_40;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Books implements BookDatabase{
    List<Book> bookList = new ArrayList<>();
    Long nextId = 1L;
    @Override
    public Long save(Book book) {  // Task6
        book.setId(nextId);
        bookList.add(book);
        nextId++;
        return book.getId();
    }
    @Override
    public boolean delete(Long bookId) {  //Task7
        for(Book book : bookList){
            if(book.getId().equals(bookId)){
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean delete(Book book) {
        return bookList.remove(book);
    } // Task8

    @Override
    public Optional<Book> findById(Long bookId) { // Task9
        for(Book book : bookList){
            if (book.getId().equals(bookId)){
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) { // Task10
        List<Book> result = new ArrayList<>();
        for(Book book : bookList){
            if(book.getAuthor().equals(author)){
                result.add(book);
            }
        }
        return result;
    }
    @Override
    public List<Book> findByTitle(String title) { // Task11
        List<Book> result = new ArrayList<>();
        for (Book book : bookList){
            if(book.getTitle().equals(title)){
                result.add(book);
            }
        }
        return result;
    }
    @Override
    public int countAllBooks() { // Task12
        return bookList.size();
    }
    @Override
    public void deleteByAuthor(String author) { // Task13
        for (Book book : bookList){
            if (book.getAuthor().equals(author)){
                bookList.remove(book);
                break;
            }
        }
    }
    @Override
    public void deleteByTitle(String title) { // Task14
        for(Book book : bookList){
            if(book.getTitle().equals(title)){
                bookList.remove(book);
                break;
            }
        }
    }
}
