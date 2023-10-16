package src.main.java.ru.homeworks;

import java.util.Scanner;

public class Homework1 {
    //Цель: научиться решать простые задачи с использованием изученных конструкций языка Java.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            int menuItem = scanner.nextInt();
            if (menuItem == 1) {
                greetings();
            } else if (menuItem == 2) {
                int a = (int) (Math.random() * 11);
                int b = (int) (Math.random() * -11);
                int c = (int) (Math.random() * 11);
                checkSign(a, b, c);
            } else if (menuItem == 3) {
                selectColor();
            } else if (menuItem == 4) {
                compareNumbers();
            } else if (menuItem == 5) {
                int initValue = (int) (Math.random() * 11);
                int delta = (int) (Math.random() * 11);
                boolean increment = Math.random() < 0.5;
                addOrSubtractAndPrint(initValue, delta, increment);
            } else if (menuItem == 0) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }

    public static void greetings() {
        //Метод печатает в столбец 4 слова: Hello, World, from, Java;
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        /*Метод считает сумму входных чисел, и если она больше или равна 0,
        то выводит в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
        */
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        /*Если data меньше 10 включительно, то в консоль будет выведено сообщение “Красный”,
         если от 10 до 20 включительно, то “Желтый”, если больше 20 - “Зеленый”;
         */
        int data = (int) (Math.random() * 31);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        /*Если a больше или равно b, то выводится в консоль сообщение “a >= b”,
         в противном случае “a < b”;
         */
        int a = (int) (Math.random() * 31);
        int b = (int) (Math.random() * 31);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        /*Если increment = true, то метод к initValue
        прибавляет delta и печатает в консоль результат, в противном случае - вычетает;
         */
        if (increment) {
            initValue += delta;
            System.out.println(initValue);
        } else {
            initValue -= delta;
            System.out.println(initValue);
        }
    }

    public static void printMenu() {
        System.out.println("""
                Выберите номер метода:
                1 - greetings
                2 - checkSign
                3 - selectColor
                4 - compareNumbers
                5 - addOrSubtractAndPrint
                0 - выход
                """);
    }
}
