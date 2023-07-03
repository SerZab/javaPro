package homeWork.extra.bookShop;

import homeWork.extra.bookShop.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Utils {
    static List<Seller> sellers = new ArrayList<>();
    static List<Customer> customers = new ArrayList<>();
    static List<Book> books = new ArrayList<>();
    static List<Order> orders = new ArrayList<>();

    public static List<BookAdditional> getCountOfSoldBookByGenre(){
        List<BookAdditional> result = new ArrayList<>();
        int countArt=0,countAdv=0,countPsy=0,countPrg=0;

        for (Order order : orders){
            countArt += getPriceOfSoldBookByGenre(order,BookGenre.Art);
            countAdv += getPriceOfSoldBookByGenre(order,BookGenre.Adventure);
            countPsy += getPriceOfSoldBookByGenre(order,BookGenre.Psychology);
            countPrg += getPriceOfSoldBookByGenre(order,BookGenre.Programming);
            result.add(new BookAdditional(BookGenre.Art,countArt));
            result.add(new BookAdditional(BookGenre.Adventure,countAdv));
            result.add(new BookAdditional(BookGenre.Psychology,countPsy));
            result.add(new BookAdditional(BookGenre.Programming,countPrg));
        }
        return result;
    }
    public static HashMap<BookGenre,Double> getPriceOfAllBooksByGenre(){
        HashMap<BookGenre,Double> result = new HashMap<>();
        double priceArt = 0,priceAdv=0,pricePsy=0,pricePrg=0;
        for (Order order : orders){
            priceArt += getPriceOfSoldBookByGenre(order,BookGenre.Art);
            priceAdv += getPriceOfSoldBookByGenre(order,BookGenre.Adventure);
            pricePsy += getPriceOfSoldBookByGenre(order,BookGenre.Psychology);
            pricePrg += getPriceOfSoldBookByGenre(order,BookGenre.Programming);
            result.put(BookGenre.Art,priceArt);
            result.put(BookGenre.Adventure,priceAdv);
            result.put(BookGenre.Psychology,pricePsy);
            result.put(BookGenre.Programming,pricePrg);
        }
        return result;
    }
    public static double getPriceOfSoldBookByGenre (Order order, BookGenre genre) {
        double price = 0;
        for (int bookId : order.getBooks()) {
            Book book = getBookById(bookId);
            if (book != null && book.getGenre() == genre) {
                price += book.getPrice();
            }
        }
        return price;
    }

    public static Profit getProfitByEmployee(int id){
        int count = 0; double price = 0;
        for (Order order : orders){
            if (order.getSellerId() == id){
                count += order.getBooks().length;
                price += getPriceOfSoldBooksInOrder(order);
            }
        }
        return new Profit(count,price);
    }
    public static double getAllPriceOfSoldBooks(){
//        double price = 0;
//        for (Order order : orders){
//            price += getPriceOfSoldBooksInOrder(order);
//        }
//        return price;
        return orders.stream().mapToDouble(Utils::getPriceOfSoldBooksInOrder).sum();
    }
    public static double getPriceOfSoldBooksInOrder (Order order){
        double price = 0;
        for (int bookId : order.getBooks()){
            Book book = getBookById(bookId);
            if (book != null){
                price += book.getPrice();
            }
        }
        return price;

    }
    public static int getCountOfSoldBooks (){
//        int count = 0;
//        for (Order order : orders){
//            count += order.getBooks().length;
//        }
//        return count;
        return orders.stream().mapToInt(order -> order.getBooks().length).sum();
    }
    public static Book getBookById(int id){
//        Book current = null;
//        for (Book book : books){
//            if (book.getId() == id){
//                current = book;
//                break;
//            }
//        }
//        return current;
        return books.stream().filter(book -> book.getId() == id).findFirst().orElse(null);
    }

    public static void initData() {
        sellers.add(new Seller(1, "Иванов Иван", 32));
        sellers.add(new Seller(2, "Петров Петр", 30));
        sellers.add(new Seller(3, "Алена Сидорова", 26));
        sellers.add(new Seller(4, "Васильев Егор", 42));

        customers.add(new Customer(1, "Сидоров Алексей", 18));
        customers.add(new Customer(2, "Романов Дмитрий", 25));
        customers.add(new Customer(3, "Васильев Егор", 19));
        customers.add(new Customer(4, "Кириенко Данил", 45));
        customers.add(new Customer(5, "Воронцова Анна", 20));
        customers.add(new Customer(6, "Антонов Дмитрий", 36));

        books.add(new Book(1, "Война и мир", "Толстой Лев", 12.50, BookGenre.Art));
        books.add(new Book(2, "Преступление и наказание", "Достоевский Федор", 18.40, BookGenre.Art));
        books.add(new Book(3, "Мертвые Души", "Гоголь Николай", 12.20, BookGenre.Art));
        books.add(new Book(4, "Руслан и Людмила", "Пушкин Александр", 17.50, BookGenre.Art));
        books.add(new Book(5, "80 дней вокруг света", "Верн Жуль", 16.50, BookGenre.Adventure));
        books.add(new Book(6, "Таинственный остров", "Верн Жуль", 15.30, BookGenre.Adventure));
        books.add(new Book(7, "20 тыс.Лье под водой", "Верн Жуль", 12.40, BookGenre.Adventure));
        books.add(new Book(8, "Введение в психоанализ", "Фрейд Зигмунд", 16.50, BookGenre.Psychology));
        books.add(new Book(9, "Психология влияния", "Чалдин Роберт", 17.50, BookGenre.Psychology));
        books.add(new Book(10, "Как перестать беспокоится", "Карнеги Дейл", 10.80, BookGenre.Psychology));
        books.add(new Book(11, "Gang of Four", "Гамма Эрих", 19.00, BookGenre.Programming));
        books.add(new Book(12, "Совершеный код", "Макконел Стив", 12.00, BookGenre.Programming));
        books.add(new Book(13, "Рефакторинг", "Фаулер Мартин", 18.50, BookGenre.Programming));
        books.add(new Book(14, "Алгоритмы", "Корман Томас", 14.50, BookGenre.Programming));


        orders.add(new Order(1, 1, 1, new int[]{11, 12, 13, 14}));
        orders.add(new Order(2, 2, 1, new int[]{1, 5, 6, 7, 12}));
        orders.add(new Order(3, 3, 2, new int[]{2, 3, 5, 6, 7, 12}));
        orders.add(new Order(4, 4, 2, new int[]{3, 4, 8, 9, 10, 12}));
        orders.add(new Order(5, 5, 3, new int[]{2, 5, 9, 12}));
        orders.add(new Order(6, 6, 3, new int[]{1, 2, 5, 6, 7, 8, 9}));
        orders.add(new Order(7, 4, 4, new int[]{2, 8, 9, 10, 13, 14}));
    }
}
