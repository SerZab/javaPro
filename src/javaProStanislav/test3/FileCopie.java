package javaProStanislav.test3;

import java.io.*;

public class FileCopie {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите имя файла: ");
            String fileName = reader.readLine();

            File sourceFile = new File(fileName);
            if (!sourceFile.exists()) {
                System.err.println("Файл не существует.");
                return;
            }

            String copiedFileName = "copied_" + sourceFile.getName();
            File copiedFile = new File(sourceFile.getParent(), copiedFileName);

            copyFile(sourceFile, copiedFile);

            System.out.println("Файл успешно скопирован: " + copiedFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    private static void copyFile(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
    }
}
