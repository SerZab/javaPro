package javaProStanislav.lesson19_22052023.exeptions;

import java.io.FileWriter;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        exceptionExample();
    }
    public static void exceptionExample(){
        FileWriter writer = null;
        try {
            writer = new FileWriter("out.txt");
            writer.write("Writing to the file");
            System.out.println("Файл записан");
        } catch (IOException е){
            System.out.println("Ошибка записи в файл");
        } finally {
            if (writer != null){
                try {
                    writer.close();
                } catch (IOException e){
                    System.out.println("Ошибка закрытия файла");
                }
            }
        }
    }
}
