package src.main.java.ru.homeworks.homework9;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final String name;
    private final int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", возраст: " + age;
    }

    /**
     * Метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
     */
    public static ArrayList<String> getNames(List<Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.name);
        }
        return names;
    }

    /**
     * Метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
     * и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
     */
    public static ArrayList<Integer> getEmployeesElderOrEqualAge(List<Employee> employees, int minAge) {
        ArrayList<Integer> ages = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.age >= minAge){
                ages.add(employee.age);
            }
        }
        return ages;
    }

    /**
     * Метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
     * и проверяющий что средний возраст сотрудников превышает указанный аргумент;
     */
    public static boolean isAverageAgeBigger(List<Employee> employees, int minAverageAge) {
        int averageAge = 0;
        for (Employee employee : employees) {
            averageAge += employee.age;
        }
        averageAge = averageAge/employees.size();
        return averageAge > minAverageAge;
    }

    /**
     * Метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.
     */
    public static Employee getYoungest(List<Employee> employees){
        Employee youngest = employees.get(0);
        for (Employee employee : employees) {
            if (employee.age < youngest.age){
                youngest = employee;
            }
        }
        return youngest;
    }
}
