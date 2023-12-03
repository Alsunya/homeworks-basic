package src.main.java.ru.homeworks.homework9;

import java.util.ArrayList;
import java.util.List;

public class EmployeesController {
    /**
     * Метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
     */
    public static ArrayList<String> getNames(List<Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.name());
        }
        return names;
    }

    /**
     * Метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
     * и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
     */
    public static List<String> getEmployeesElderOrEqualAge(List<Employee> employees, int minAge) {
        ArrayList<String> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.age() >= minAge){
                result.add(employee.name());
            }
        }
        return result;
    }

    /**
     * Метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
     * и проверяющий что средний возраст сотрудников превышает указанный аргумент;
     */
    public static boolean isAverageAgeBigger(List<Employee> employees, int minAverageAge) {
        int averageAge;
        int sumOfAges = 0;
        for (Employee employee : employees) {
            sumOfAges += employee.age();
        }
        averageAge = sumOfAges/employees.size();
        return averageAge > minAverageAge;
    }

    /**
     * Метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.
     */
    public static Employee getYoungest(List<Employee> employees){
        Employee youngest = employees.get(0);
        for (Employee employee : employees) {
            if (employee.age() < youngest.age()){
                youngest = employee;
            }
        }
        return youngest;
    }
}
