package homeWork.extra.bookShop.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookAdditional {
    private BookGenre genre;
    private int count;
}
