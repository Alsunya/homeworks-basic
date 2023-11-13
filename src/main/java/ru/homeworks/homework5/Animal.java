package src.main.java.ru.homeworks.homework5;

public abstract class Animal {
    protected String name;
    protected int runningSpeed;
    protected int endurance;
    protected float run(int distance) {
        if (endurance >= distance){
            endurance = endurance - distance;
            System.out.println("Животное " + name + " пробежало " + distance + " метров за " +
                    (float) distance / (float) runningSpeed + " секунд.");
            return (float)distance / (float)runningSpeed;
        }
        else {
            System.out.println("У животного " + name + " появилось состояние усталости. Оно не пробежит " +
                    distance + " метров.");
            return -1;
        }
    }
    protected abstract float swim(int distance);
    protected void info(){
        System.out.println("Состояние животного " + name + ":");
        if (endurance > 0){
            System.out.println("У животного еще есть " + endurance + " единиц выносливости.");
        }
        else{
            System.out.println("Животное устало.");
        }
    }
}
