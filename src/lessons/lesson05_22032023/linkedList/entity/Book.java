package lessons.lesson05_22032023.linkedList.entity;

public class Book {
    private int bookId;

    private Author author;

    private String nameOfBook;

    public Book(int bookId, Author author, String nameOfBook) {

        this.bookId = bookId;
        this.author = author;
        this.nameOfBook = nameOfBook;
    }

    public int getBookId() {
        return bookId;
    }

    public Author getAuthor() {
        return author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", author=" + author +
                ", nameOfBook='" + nameOfBook + '\'' +
                '}';
    }
}
