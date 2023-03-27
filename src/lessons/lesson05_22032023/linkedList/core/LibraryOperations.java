package lessons.lesson05_22032023.linkedList.core;

import lessons.lesson05_22032023.linkedList.service.InputData;
import lessons.lesson05_22032023.linkedList.service.LibraryUtil;
import lessons.lesson05_22032023.linkedList.service.OutputData;
import lessons.lesson05_22032023.linkedList.entity.Book;

import java.util.List;

public class LibraryOperations {
    LibraryUtil lu = new LibraryUtil();
    InputData inputData = new InputData();
    OutputData outputData = new OutputData();


    public void run() {
        int sizeOfOurLibrary = inputData.inputNumberOfElements();
        List<Book> ourLibrary = lu.createLibrary();
        lu.fillLibrary(ourLibrary,sizeOfOurLibrary,inputData,false);
        outputData.printOurLibrary("Our library",ourLibrary);



        int numberElementsForSecondAdd = inputData.inputNumberOfElementsForSecondAdd();
        lu.fillLibrary(ourLibrary,numberElementsForSecondAdd,inputData,true);
        lu.fillLibrary(ourLibrary,numberElementsForSecondAdd,inputData,false);

        outputData.printOurLibrary("Our library after second addition ",ourLibrary);

        System.out.println("=========================");

        List<Book> booksAfterSearch = lu.searchBook(ourLibrary, inputData.inputSearchCriteria());
        outputData.printOurLibrary("Search books:", booksAfterSearch);

        lu.deleteBook(ourLibrary, booksAfterSearch);
        outputData.printOurLibrary("Our library after delete book ",ourLibrary);

        outputData.printOurLibrary("Duplicate collection", lu.createDuplicateLibrary(ourLibrary));
    }

}
