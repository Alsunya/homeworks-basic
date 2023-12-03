package src.main.java.ru.homeworks.homework9;

import java.util.ArrayList;
import java.util.Arrays;

import static src.main.java.ru.homeworks.homework9.EmployeesController.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 0, 6, 3));
        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Иван", 23),
                new Employee("Петр", 33),
                new Employee("Вадим", 31),
                new Employee("Егор", 27)));

        System.out.println(sequence(4, 9));
        System.out.println(sum(arrayList));
        overwriteList(1, arrayList);
        System.out.println(arrayList);
        increaseList(1, arrayList);
        System.out.println(arrayList);
        System.out.println(getNames(employees));
        System.out.println(getEmployeesElderOrEqualAge(employees, 27));
        System.out.println(isAverageAgeBigger(employees, 20));
        System.out.println(getYoungest(employees));
    }

    /**
     * Метод, принимающий в качестве аргументов числа min и max,
     * и возвращающий ArrayList с набором последовательных значений в указанном диапазоне
     * (min и max включительно, шаг - 1);
     */
    public static ArrayList sequence(int min, int max){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }

    /**
     * Метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы,
     * значение которых больше 5, и возвращающий сумму;
     */
    public static int sum(ArrayList<Integer> arrayList){
        int sum = 0;
        for (int i : arrayList) {
            if (i > 5){
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Метод, принимающий в качестве аргументов целое число и ссылку на список,
     * метод должен переписать каждую заполненную ячейку списка указанным числом;
     */
    public static void overwriteList(int number, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
        //Другое решение: Collections.fill(list, number);
    }

    /**
     * Метод, принимающий в качестве аргументов целое число и ссылку на список,
     * увеличивающий каждый элемент списка на указанное число;
     */
    public static void increaseList(int number, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
        // Другое решение: list.replaceAll(integer -> integer + number);
    }
}
