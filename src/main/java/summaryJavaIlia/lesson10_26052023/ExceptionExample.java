package summaryJavaIlia.lesson10_26052023;

import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) {
    //    throw new RuntimeException("Something went wrong");

        try {
            someMethod();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Final operation");
        }
    }

    private static void someMethod() throws IOException {
        throw new IOException();
    }
}
