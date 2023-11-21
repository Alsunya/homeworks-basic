package src.main.java.ru.homeworks.homework7.transports;

import src.main.java.ru.homeworks.homework7.TypeOfTerrain;

public class Car implements Transport {
    String model;
    int gasoline;

    public Car(String model) {
        this.model = model;
        this.gasoline = 100;
    }


    @Override
    public boolean move(int distance, TypeOfTerrain typeOfTerrain) {
        if (typeOfTerrain == TypeOfTerrain.FOREST || typeOfTerrain == TypeOfTerrain.SWAMP) {
            System.out.println("Машина не может перемещаться по местности " + typeOfTerrain.getName() + ".");
            return false;
        } else if (gasoline < distance) {
            System.out.println("На дистанцию " + distance + " у машины не хватит бензина.");
            return false;
        } else {
            gasoline -= distance;
            System.out.println("Машина проехала дистанцию " + distance + " по местности " +
                    typeOfTerrain.getName() + ".");
            return true;
        }
    }

    @Override
    public String getName() {
        return model;
    }
}
