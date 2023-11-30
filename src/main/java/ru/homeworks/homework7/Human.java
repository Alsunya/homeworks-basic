package src.main.java.ru.homeworks.homework7;

import src.main.java.ru.homeworks.homework7.transports.Transport;

public class Human {
    String name;
    Transport currentTransport;
    boolean isOnTransport;
    public Human(String name) {
        this.name = name;
    }
    public void getOnTransport(Transport transport) {
        if (isOnTransport) {
            System.out.println(name + " уже сел на транспорт " + currentTransport.getName() +
                    ". Надо встать с него, чтобы сесть на другой транспорт.");
        } else {
            currentTransport = transport;
            isOnTransport = true;
            System.out.println(name + " сел на транспорт " + transport.getName() + ".");
        }
    }
    public void getOffTransport(){
        currentTransport = null;
        isOnTransport = false;
        System.out.println(name + " встал с транспорта.");
    }
    public boolean move(TypeOfTerrain typeOfTerrain, int distance){
        if (currentTransport == null){
            System.out.println(name + " прошел дистанцию " + distance + " по местности " +
                    typeOfTerrain.getName() + " пешком.");
            return true;
        }
        else {
            return currentTransport.move(distance, typeOfTerrain);
        }
    }
}
