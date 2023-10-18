package src.main.java.ru.homeworks;

import java.util.Arrays;

public class Homework2 {
    static int[] array = new int[]{3, 5, 6, 4, 10, 1};
    static int[] emptyArray = new int[8];
    //Цель: научиться решать простые задачи с использованием изученных конструкций языка Java.
    public static void main(String[] args) {
        printString(3, "Hello!");
        sumArray(array);
        fillArray(7, emptyArray);
        increaseArray(2, array);
        biggerSum(array);
    }

    //Метод, принимающий в качестве аргументов целое число и строку,
    //и печатающий в консоль строку указанное количество раз
    public static void printString(int times, String string){
        for (int i = 0; i < times; i++) {
            System.out.println(string);
        }
    }

    //Метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы,
    //значение которых больше 5, и печатающий полученную сумму в консоль.
    public static void sumArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            if (value > 5) {
                sum += value;
            }
        }
        System.out.println(sum);
    }

    //Метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    //метод должен заполнить каждую ячейку массива указанным числом.
    public static void fillArray(int number, int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
        System.out.println(Arrays.toString(array));
    }

    //Метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    //увеличивающий каждый элемент которого на указанное число.
    public static void increaseArray(int number, int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }
        System.out.println(Arrays.toString(array));
    }

    //Метод, принимающий в качестве аргумента целочисленный массив,
    //и печатающий в консоль сумма элементов какой из половин массива больше.
    public static void biggerSum(int[] array){
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < array.length/2; i++) {
            firstSum += array[i];
        }
        for (int i = array.length/2; i < array.length; i++) {
            secondSum += array[i];
        }
        if(firstSum == secondSum){
            System.out.println("Суммы половин массива равны");
        }
        else {
            System.out.println(firstSum > secondSum ?
                    "Сумма первой половины больше и равна " + firstSum :
                    "Сумма второй половины больше и равна " + secondSum);
        }
    }
}
