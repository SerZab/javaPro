package summaryJavaIlia.lesson09_19052023;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {

//        String text = "This is my first experience when I myself work with IO API. I can do everything!";
//
//        try (FileWriter file = new FileWriter("./src/summaryJavaIlia/lesson09_19052023/text.txt")) {
//            file.write(text);
//            System.out.println("Файл создан");
//        } catch (IOException e) {
//            System.out.println("Ошибка " + e.getMessage());
//        }


        File dir = new File("./src/summaryJavaIlia/lesson09_19052023/dir");
        File file = new File("./src/summaryJavaIlia/lesson09_19052023/dir", "text1.txt");
        System.out.println("Folder created "+ dir.mkdir());
        System.out.println("File created " + file.createNewFile());
        String text1 = "This is my first experience when I myself work with IO API. I can do everything!";
        try (FileWriter fileWriter = new FileWriter("./src/summaryJavaIlia/lesson09_19052023/dir/text1.txt")) {
            fileWriter.write(text1);
            System.out.println("Файл создан");
        } catch (IOException e) {
            System.out.println("Ошибка " + e.getMessage());
        }

        if(file.exists() && dir.exists()){
            file.delete();
            dir.delete();
            System.out.println("File & dir deleted");
        } else {
            System.out.println("Error");
        }
    }
}
