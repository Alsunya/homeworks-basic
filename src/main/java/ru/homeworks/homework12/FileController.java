package src.main.java.ru.homeworks.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileController {
    public static List<File> getAllTextFiles(String directoryPath) {
        List<File> textFiles = new ArrayList<>();
        File folder = new File(directoryPath);

        if (folder.isDirectory()) {
            File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        textFiles.add(file);
                    }
                }
            }
        }
        return textFiles;
    }

    public static void readFromFile(String filePath){
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(filePath))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char)n);
                n = in.read();
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void writeInFile(String filePath, String data) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filePath, true))) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            for (byte b : buffer) {
                out.write(b);
            }
            out.write("\n".getBytes());
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
