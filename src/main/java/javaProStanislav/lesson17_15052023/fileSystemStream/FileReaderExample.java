package javaProStanislav.lesson17_15052023.fileSystemStream;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
//        FileReader fileReader = new FileReader("test_stream.txt");

//        int character;
//
//       while ((character = fileReader.read()) != -1){
//           System.out.println((char) character + " ");
//       }
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test_stream.txt"));
        String line;
         int counter = 0;
         while ((line = bufferedReader.readLine()) != null){
           counter++;
           System.out.println("Line # " + counter + " : "+ line);
       }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test2.txt", true));
        String newLine = "This is a new line.";
        bufferedWriter.newLine(); // Добавляем новую строку перед новой записью
        bufferedWriter.write(newLine);
        bufferedWriter.close();
    }

}
