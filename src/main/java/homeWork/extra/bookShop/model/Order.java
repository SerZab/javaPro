package homeWork.extra.bookShop.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
    private int id;
    private int customerId;
    private int sellerId;
    private int[] books;
    
}
