package src.main.java.ru.homeworks;

public class Homework3 {
    //Цель: научиться решать простые задачи с использованием изученных конструкций языка Java.
    public static void main(String[] args) {
        int [][] array = new int [][]{{2, 3, 1, 1}, {3, 4, 1, 4}, {1, 3, 4, 5}, {3, 6, 4, 3}};
        System.out.println(sumOfPositiveElements(new int[][]{{2, -3, 0, 3, 2}, {3, 4, -1, 1, -4}, {0, 2}}) + "\n");
        printSquare(5);
        zeroDiagonal(array);
        System.out.println(findMax(array) + "\n");
        System.out.println(secondLineSum(array));
    }

    //Метод, принимающий в качестве аргумента целочисленный двумерный массив,
    //метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    //Метод принимает в качестве аргумента int size
    //и печатает в консоль квадрат из символов * со сторонами соответствующей длины;
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Метод, принимающий в качестве аргумента двумерный целочисленный массив,
    //и зануляющий его диагональные элементы;
    public static void zeroDiagonal(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == j){
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Метод ищет и возвращает максимальный элемент массива;
    public static int findMax(int[][] array){
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    //Метод считает сумму элементов второй строки двумерного массива,
    //если второй строки не существует, то в качестве результата необходимо вернуть -1.
    public static int secondLineSum(int [][] array){
        int sum = 0;
        if(array.length < 2){
            return -1;
        }
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
