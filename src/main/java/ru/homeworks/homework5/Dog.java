package src.main.java.ru.homeworks.homework5;

public class Dog extends Animal{
    private int swimmingSpeed;

    public Dog(String name, int runningSpeed, int endurance, int swimmingSpeed) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.endurance = endurance;
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    protected float swim(int distance) {
        if (endurance >= distance * 2){
            endurance = endurance - distance * 2;
            System.out.println("Животное " + name + " проплыло " + distance + " метров за " +
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
