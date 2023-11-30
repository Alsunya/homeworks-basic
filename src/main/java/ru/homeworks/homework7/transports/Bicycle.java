package src.main.java.ru.homeworks.homework7.transports;

import src.main.java.ru.homeworks.homework7.TypeOfTerrain;

public class Bicycle implements Transport {
    String model;

    public Bicycle(String model) {
        this.model = model;
    }

    @Override
    public boolean move(int distance, TypeOfTerrain typeOfTerrain) {
        if (typeOfTerrain == TypeOfTerrain.SWAMP) {
            System.out.println("Велосипед не может перемещаться по местности " + typeOfTerrain.getName() + ".");
            return false;
        } else {
            System.out.println("Велосипед проехал дистанцию " + distance + " по местности " +
                    typeOfTerrain.getName() + ".");
            return true;
        }
    }
    @Override
    public String getName() {
        return model;
    }
}
