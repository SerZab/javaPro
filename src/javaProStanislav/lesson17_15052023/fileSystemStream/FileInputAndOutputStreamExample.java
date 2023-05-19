package javaProStanislav.lesson17_15052023.fileSystemStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputAndOutputStreamExample {
    public static void main(String[] args) {

    }
    public static void outputExample() throws IOException {
        String path = "test_stream.txt";
        FileOutputStream outputStream = new FileOutputStream(path);
        outputStream.write("\n Hello from Java output stream".getBytes());
        outputStream.close();
    }
    public static void inputExample() throws IOException {
        String path = "test_stream.txt";
        FileInputStream input = new FileInputStream(path);
        int inputData = input.read();
        while (inputData != -1){
            System.out.print((char)inputData+" ");
            inputData = input.read();
        }
        input.close();
    }
}
