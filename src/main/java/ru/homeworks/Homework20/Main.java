package src.main.java.ru.homeworks.Homework20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Цель занятия: изучить принцип работы с потоками ввода/вывода.
 * ТЗ:
 * Реализуйте метод, который подсчитывает сколько раз в текстовом файле (с кодировкой UTF-8) встречается
 * указанная последовательность символов с учетом регистра;
 * При запуске приложения пользователь вводит имя файла и искомую последовательность символов,
 * программа должна выполнить расчет и напечатать результат в консоль.
 */

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите путь к файлу: ");
            String fileName = reader.readLine();

            System.out.print("Введите искомую последовательность символов: ");
            String searchSequence = reader.readLine();

            int repetitions = repetitionsCount(fileName, searchSequence);
            System.out.println("Количество вхождений указанной последовательности символов в файле: " + repetitions);

        } catch (IOException e) {
            System.err.println("Ошибка при вводе данных: " + e.getMessage());
        }
    }

    public static int repetitionsCount(String fileName, String searchSequence) throws IOException {
        int count = 0;

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                count += repetitionsCountInLine(line, searchSequence);
            }
        }
        return count;
    }

    public static int repetitionsCountInLine(String line, String searchSequence) {
        if (line == null || line.isEmpty() || searchSequence == null || searchSequence.isEmpty()) {
            return 0;
        }
        int count = 0;
        int index = line.indexOf(searchSequence);

        while (index != -1) {
            count++;
            index = line.indexOf(searchSequence, index + 1);
        }
        return count;
    }
}
