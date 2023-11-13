package src.main.java.ru.homeworks.homework5;

//Цель домашнего задания: научиться работать с наследованием и полиморфизмом.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", 12, 50);
        Dog dog = new Dog("Rex", 10, 60, 2);
        Horse horse = new Horse("Arrow", 18,80,3);
        cat.run(30);
        cat.swim(6);
        dog.info();
        dog.run(5);
        dog.swim(9);
        dog.info();
        horse.run(12);
        horse.info();
        horse.swim(20);
        horse.swim(9);
    }
}
