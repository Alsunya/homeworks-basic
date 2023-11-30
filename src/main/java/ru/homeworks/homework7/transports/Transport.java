package src.main.java.ru.homeworks.homework7.transports;

import src.main.java.ru.homeworks.homework7.TypeOfTerrain;

public interface Transport {
    boolean move(int distance, TypeOfTerrain typeOfTerrain);
    String getName();
}
