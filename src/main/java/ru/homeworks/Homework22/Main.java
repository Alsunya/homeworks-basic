package ru.homeworks.Homework22;

import java.util.Arrays;

/**
 * Цель: научиться писать тесты с использованием JUnit.
 * ТЗ:
 * Реализовать метод, принимающий в качестве аргумента одномерный целочисленный массив,
 * и возвращающий новый массив, который содержит элементы исходного массива, идущие после последней единицы.
 * Если входной массив не содержит единиц, то должно быть брошено RuntimeException.
 * Примеры:
 * Входной массив: [ 1 2 1 2 2 ] => Результат: [ 2 2 ]
 * Входной массив: [ 2 2 2 2 ] => RuntimeException
 * Реализовать метод, проверяющий входной массив, что он состоит только из чисел 1 и 2.
 * Если в массиве присутствуют числа кроме 1 и 2, или нет хотя бы одной единицы или двойки,
 * то результат должен быть равен false
 * Примеры:
 * [ 1 2 ] => true
 * [ 1 1 ] => false
 * [ 1 3 ] => false
 * [ 1 2 2 1 ] => true
 * Реализовать набор тестов для методов.
 */
public class Main {
    public static int[] trimArrayAfterLastDigitOne(int[] array){
        int lastDigitOne = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                lastDigitOne = i;
            }
        }
        if (lastDigitOne == -1){
            throw new RuntimeException();
        }
        else {
            return Arrays.copyOfRange(array, lastDigitOne+1, array.length);
        }
    }
    public static boolean consistsOfOnesAndTwos(int[] array){
        boolean containsOne = false;
        boolean containsTwo = false;

        for (int number : array) {
            if (number == 1) {
                containsOne = true;
            } else if (number == 2) {
                containsTwo = true;
            } else {
                return false;
            }
        }
        return containsOne && containsTwo;
    }
}
