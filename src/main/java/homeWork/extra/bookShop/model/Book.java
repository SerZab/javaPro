package homeWork.extra.bookShop.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private int id;
    private String title;
    private String author;
    private double price;
    private BookGenre genre;
}
