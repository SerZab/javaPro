package javaProStanislav.lesson17_15052023.fileSystemStream;

import java.io.File;

public class Example5 {
    public static void main(String[] args) {
        File file = new File("testForWriting.txt");
        boolean isExists = file.exists();
        System.out.println("Does file exist? " + isExists);

        file = new File("new_dir");
        boolean wasCreated = file.mkdir();
        System.out.println("Directory was created?"+ wasCreated);

        File directory = new File("new_dir");
        boolean directory1 = directory.isDirectory();
        System.out.println(directory1);

//        boolean delete = directory.delete();
//        System.out.println(delete);

        
    }
}
