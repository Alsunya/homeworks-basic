package src.main.java.ru.homeworks.homework7.transports;

import src.main.java.ru.homeworks.homework7.TypeOfTerrain;

public class Horse implements Transport {
    String name;
    int energy;

    public Horse(String name) {
        this.name = name;
        this.energy = 100;
    }

    @Override
    public boolean move(int distance, TypeOfTerrain typeOfTerrain) {
        if (typeOfTerrain == TypeOfTerrain.SWAMP) {
            System.out.println("Лошадь не может перемещаться по местности " + typeOfTerrain.getName() + ".");
            return false;
        } else if (energy < distance) {
            System.out.println("На дистанцию " + distance + " у лошади не хватит сил.");
            return false;
        } else {
            energy -= distance;
            System.out.println("Лошадь проскакала дистанцию " + distance + " по местности " +
                    typeOfTerrain.getName() + ".");
            return true;
        }
    }
    @Override
    public String getName() {
        return name;
    }
}
