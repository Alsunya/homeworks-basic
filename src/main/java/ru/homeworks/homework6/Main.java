package src.main.java.ru.homeworks.homework6;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Мурзик", 2),
                new Cat("Барсик", 3),
                new Cat("Василек", 1),
                new Cat("Уголек", 2)};
        Plate plate = new Plate(5);
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        System.out.println();
        for (Cat cat : cats) {
            cat.info();
        }
        System.out.println();
        plate.addFood(4);
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        System.out.println();
        for (Cat cat : cats) {
            cat.info();
        }
    }
}
