package src.main.java.ru.homeworks.homework7.transports;

import src.main.java.ru.homeworks.homework7.TypeOfTerrain;

public class AllTerrainVehicle implements Transport {
    String model;

    public AllTerrainVehicle(String model) {
        this.model = model;
        this.gasoline = 100;
    }

    int gasoline;
    @Override
    public boolean move(int distance, TypeOfTerrain typeOfTerrain) {
        if (gasoline < distance) {
            System.out.println("На дистанцию " + distance + " у вездехода не хватит бензина.");
            return false;
        } else {
            gasoline -= distance;
            System.out.println("Вездеход проехал дистанцию " + distance + " по местности " +
                    typeOfTerrain.getName() + ".");
            return true;
        }
    }
    @Override
    public String getName() {
        return model;
    }
}
