package javaProStanislav.lesson17_15052023.fileSystemStream;

import java.io.*;

public class FileReaderExample2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("test3.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt"));

        String line = "";


        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
