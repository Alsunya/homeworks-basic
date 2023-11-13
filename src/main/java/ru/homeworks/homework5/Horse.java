package src.main.java.ru.homeworks.homework5;

public class Horse extends Animal{
    private int swimmingSpeed;

    public Horse(String name, int runningSpeed, int endurance, int swimmingSpeed) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.endurance = endurance;
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    protected float swim(int distance) {
        if (endurance >= distance * 4){
            endurance = endurance - distance * 4;
            System.out.println("Животное " + name + " проплыло " + distance + " метров " +
                    (float) distance / (float) swimmingSpeed + " секунд.");
            return (float)distance / (float)swimmingSpeed;
        }
        else {
            System.out.println("У животного " + name + " появилось состояние усталости. Оно не проплывет " +
                    distance + " метров.");
            return -1;
        }
    }
}
