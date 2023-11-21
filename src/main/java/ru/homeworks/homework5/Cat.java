package src.main.java.ru.homeworks.homework5;

public class Cat extends Animal{
    public Cat(String name, int runningSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.endurance = endurance;
    }

    @Override
    protected float swim(int distance) {
        System.out.println("Коты плавать не умеют.");
        return -1;
    }
}
