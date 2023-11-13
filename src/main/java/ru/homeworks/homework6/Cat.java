package src.main.java.ru.homeworks.homework6;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate){
        if (satiety){
            System.out.println("Кот " + name + " уже сыт.");
        }
        else if (plate.decreaseFood(appetite)){
            satiety = true;
            System.out.println("Кот " + name + " утолил голод.");
        }
        else {
            System.out.println("Коту " + name + " не хватит еды в тарелке, чтобы насытиться.");
        }
    }

    public void info(){
        System.out.println("Кот " + name + (satiety? " сыт." : " голоден."));
    }
}
