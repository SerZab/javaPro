package lessons.lesson05_22032023.linkedList.service;

import lessons.lesson05_22032023.linkedList.entity.Book;

import java.util.List;

public class OutputData {


    public void printOurLibrary(String message, List<Book> ourLibrary){

        System.out.println(message);
        for (Book book : ourLibrary) {
            System.out.println(book);
        }
    }
}
