package homeWork.extra.bookShop;

import homeWork.extra.bookShop.model.BookAdditional;
import homeWork.extra.bookShop.model.BookGenre;
import homeWork.extra.bookShop.model.Seller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static homeWork.extra.bookShop.Utils.*;

public class BookApp {
    public static void main(String[] args) {
        initData();
        System.out.printf("Общее количество проданных книг %d на сумму %.2f euro",
                getCountOfSoldBooks(), getAllPriceOfSoldBooks());
        System.out.println();
        System.out.println("===================");
        for (Seller seller : sellers){
            System.out.println(seller.getName() + " продал(а) " + getProfitByEmployee(seller.getId()));
        }
        System.out.println("=============");

        List<BookAdditional> soldBooksCount = getCountOfSoldBookByGenre();
        HashMap<BookGenre,Double> soldBooksPrices = getPriceOfAllBooksByGenre();
        for (BookAdditional bookAdditional : soldBooksCount){
            double price = soldBooksPrices.get(bookAdditional.getGenre());
            System.out.println(String.format("По жанру: %s продано %d книг, общей стоимостью %f",
                    bookAdditional.getGenre().name(),bookAdditional.getCount(),price));

        }

    }
}
