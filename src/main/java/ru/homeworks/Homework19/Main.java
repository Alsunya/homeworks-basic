package src.main.java.ru.homeworks.Homework19;

/**
 * ТЗ:
 * Создайте классы Fruit, Apple extends Fruit, Orange extends Fruit;
 * Создайте класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта:
 * Box только для яблок, Box только для апельсин, Box и для тех, и для других фруктов.
 * Для хранения фруктов внутри коробки используйте ArrayList;
 * Реализуйте метод добавления фрукта в коробку;
 * Реализуйте метод weight, который высчитывает вес коробки (например, из веса одного фрукта и их количества,
 * или может через суммирование, как посчитаете нужным). Вес фрукта задаете самостоятельно, единицы измерения не важны;
 * Реализуйте метод compare, позволяющий сравнить текущую коробку с переданной в качестве аргумента.
 * true – если их массы равны. Можно сравнивать коробки с разными типами фруктов;
 * Реализуйте метод, позволяющий пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов в коробках;
 */

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple(2);
        Orange orange = new Orange(3);
        Apple apple2 = new Apple(1);
        Orange orange2 = new Orange(3);
        Box<Apple> appleBox = new Box<>(apple, apple2);
        Box<Orange> orangeBox = new Box<>(orange, orange2);
        appleBox.addFruit(apple2);
        System.out.println("Вес коробки для апельсинов - " + orangeBox.weight());
        System.out.println("Вес коробки1 для яблок - " + appleBox.weight());
        Box<Apple> appleBox2 = new Box<>();
        System.out.println("Вес коробки2 для яблок - " + appleBox2.weight());
        appleBox.putInto(appleBox2);
        System.out.println("Вес коробки для апельсинов - " + orangeBox.weight());
        System.out.println("Вес коробки1 для яблок после пересыпания - " + appleBox.weight());
        System.out.println("Вес коробки2 для яблок после пересыпания - " + appleBox2.weight());
        System.out.println("Равны ли по весу коробки для яблок? - " + appleBox.compare(orangeBox));

    }
}
