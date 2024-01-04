package src.main.java.ru.homeworks.homework12;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static src.main.java.ru.homeworks.homework12.FileController.*;

/**
 * Описание/Пошаговая инструкция выполнения домашнего задания:
 * Реализуйте приложение, позволяющее работать с текстовыми файлами
 * При старте приложения, в консоль выводится список текстовых файлов из корневого каталога проекта
 * Далее программа запрашивает имя файла, с которым хочет работать пользователь
 * Содержимое файла выводится в консоль
 * Затем любую введенную пользователем строку необходимо записывать в указанный файл
 */
public class Application {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        boolean flag;
        while (true){
            printFiles();
            String file = scanner.nextLine();
            readFromFile(file);
            System.out.println("Введите текст на английском. Для выхода введите 'Выход'.");
            flag = true;
            while (flag){
                String text = scanner.nextLine();
                if (text.equals("Выход")){
                    flag = false;
                }
                else{
                    writeInFile(file, text);
                }
            }
        }
    }
    public static void printFiles() {
        List<File> textFiles = getAllTextFiles(System.getProperty("user.dir"));
        System.out.println("Список доступных файлов: ");
        for (File textFile : textFiles) {
            System.out.println(textFile.getName());
        }
        System.out.println("Укажите имя файла, с которым Вы хотите работать.");
    }
}
