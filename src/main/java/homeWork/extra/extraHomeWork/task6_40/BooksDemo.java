package homeWork.extra.extraHomeWork.task6_40;

public class BooksDemo {
    
    public static void main(String[] args) {
        Books books = new Books();
        Book book1 = new Book("Лев Толстой", "Война и Мир", "1920");
        Long id1 = books.save(book1);
        System.out.println("id 1: " + id1 + " - " + book1); // должно быть 1

        Book book2 = new Book("Михаил Булгаков", "Мастер и Маргарита", "1925");
        Long id2 = books.save(book2);
        System.out.println("id 2: " + id2+ " - " + book2); // должно быть 2

        Book book3 = new Book("Николай Гоголь", "Мёртвые души", "1930");
        Long id3 = books.save(book3);
        System.out.println("id 3: " + id3+ " - " + book3); // должно быть 3

        Book book4 = new Book("Илья Ильф, Евгений Петров", "Двенадцать стульев", "1935");
        Long id4 = books.save(book4);
        System.out.println("id 4: " + id4+ " - " + book4); // 4
        System.out.println("---------------");

        // реализация Task7, удаление по id
//        books.delete(id2);
//        for(Book book : books.bookList){
//            System.out.println(book);
//        }
//        System.out.println("---------------");

        // реализация Task8, удаление по объекту
//        books.delete(book3);
//        for (Book book : books.bookList){
//            System.out.println(book);
//        }
//        System.out.println("---------------");

        // реализация Task9
        System.out.println(books.findById(id3));
        System.out.println(books.findById(id4));
        System.out.println("---------------");

        // реализация Task10
        System.out.println(books.findByAuthor("Михаил Булгаков"));
        System.out.println(books.findByAuthor("Лев Толстой"));
        System.out.println("---------------");

        // реализация Task11
        System.out.println(books.findByTitle("Война и Мир"));
        System.out.println(books.findByTitle("Двенадцать стульев"));
        System.out.println("---------------");

        // реализация Task12
        System.out.println(books.countAllBooks());
        System.out.println("---------------");

        // реализация Task13
//        books.deleteByAuthor("Илья Ильф, Евгений Петров");


        // реализация Task14
//        books.deleteByTitle("Война и Мир");
        for (Book book : books.bookList){
            System.out.println(book);
        }
        System.out.println("---------------");

        // реализация Task15,16
        AuthorSearchCriteria asc = new AuthorSearchCriteria("Лев Толстой");
        System.out.println(asc.match(book1)); // true
        System.out.println(asc.match(book2)); // false
        System.out.println("---------------");

        // реализация Task17
        TitleSearchCriteria tsc = new TitleSearchCriteria("Мастер и Маргарита");
        System.out.println(tsc.match(book1)); // false
        System.out.println(tsc.match(book2)); // true
        System.out.println("---------------");

        // реализация Task18
        YearOfIssueSearchCriteria ysc = new YearOfIssueSearchCriteria("1920");
        System.out.println(ysc.match(book1)); // true
        System.out.println(ysc.match(book2)); // false

    }
}
