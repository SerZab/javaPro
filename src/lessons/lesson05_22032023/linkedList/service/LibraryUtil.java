package lessons.lesson05_22032023.linkedList.service;

import lessons.lesson05_22032023.linkedList.service.InputData;
import lessons.lesson05_22032023.linkedList.entity.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class LibraryUtil {
    public List<Book> createLibrary() {
        return new LinkedList<>();
    }

    public void fillLibrary(List<Book> ourLibrary, int numberOfElementsAdd, InputData inputData, boolean isHead){

        for (int i = 0; i < numberOfElementsAdd; i++) {
            Book book = inputData.inputNewBook();
            addElementIntoOurLibrary(ourLibrary, book, isHead);
        }
    }

    private void addElementIntoOurLibrary(List<Book> ourLibrary, Book newBook, boolean isHead){
        if (isHead) {
            ourLibrary.add(0, newBook);
        } else {
            ourLibrary.add(newBook);}
    }

    public List<Book> searchBook(List<Book> ourLibrary, String searchCriteria){
        List<Book> booksAfterSearch = new ArrayList<>();
        for (int i = 0; i < ourLibrary.size(); i++) {
            if (searchCriteria.equals(ourLibrary.get(i).getNameOfBook())) {
                booksAfterSearch.add(ourLibrary.get(i));
            }
        }
        return booksAfterSearch;
    }

    public void deleteBook(List<Book> ourLibrary, List<Book> booksForDelete){
        for (int i = 0; i < booksForDelete.size(); i++) {
            ourLibrary.remove(booksForDelete.get(i));
        }
    }

    public List<Book> createDuplicateLibrary(List<Book> ourLibrary){
        List<Book> duplicateCollection = new ArrayList<>(ourLibrary);
        return duplicateCollection;
    }

    public void sortOurLibrary(List<Book> ourLibrary, boolean isGrow){

    }

}