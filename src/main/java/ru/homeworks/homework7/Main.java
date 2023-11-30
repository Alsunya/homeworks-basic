package src.main.java.ru.homeworks.homework7;

import src.main.java.ru.homeworks.homework7.transports.Bicycle;
import src.main.java.ru.homeworks.homework7.transports.Car;
import src.main.java.ru.homeworks.homework7.transports.Horse;

/**
 * Цель:
 * Практика в задачах применения интерфейсов и перечислений
 */
public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse("Стрела");
        Car car = new Car("BMW");
        Bicycle bicycle = new Bicycle("Stels");
        Human human = new Human("Игорь");
        human.getOnTransport(car);
        human.getOnTransport(horse);
        human.move(TypeOfTerrain.FOREST, 23);
        human.move(TypeOfTerrain.FIELD, 50);
        human.move(TypeOfTerrain.FIELD, 70);
        human.getOffTransport();
        human.getOnTransport(bicycle);
        human.move(TypeOfTerrain.SWAMP, 20);
        human.move(TypeOfTerrain.FOREST,4);
        human.move(TypeOfTerrain.FIELD, 30);
        human.getOffTransport();
        human.move(TypeOfTerrain.SWAMP,5);
        human.getOnTransport(horse);
        human.move(TypeOfTerrain.FOREST, 300);
    }
}
