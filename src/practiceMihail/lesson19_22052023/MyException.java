package practiceMihail.lesson19_22052023;

import java.io.FileNotFoundException;

public class MyException extends FileNotFoundException {
    public MyException(String message) {
        super(message);
    }
}
class ErrorMessage {
    public static final String SMTH_NOT_FOUND = "smth not found exception";
}