package src.main.java.ru.homeworks.homework6;

public class Plate {
    private final int maxFoodAmount;
    private int currentFoodAmount;

    public Plate(int maxFoodAmount) {
        this.maxFoodAmount = maxFoodAmount;
        this.currentFoodAmount = maxFoodAmount;
    }

    public void addFood(int foodAmount){
        if (currentFoodAmount == maxFoodAmount){
            System.out.println("Тарелка уже полная.");
        }
        else if (foodAmount + currentFoodAmount > maxFoodAmount){
            System.out.println("В тарелке столько не поместится.");
        }
        else {
            currentFoodAmount += foodAmount;
            System.out.println("В тарелку добавлено " + foodAmount + " еды. Теперь в ней " +
                    currentFoodAmount + " еды.");
        }
    }

    public boolean decreaseFood(int foodAmount){
        if (currentFoodAmount == 0){
            System.out.println("Тарелка пустая.");
            return false;
        }
        else if (foodAmount > currentFoodAmount){
            System.out.println("В тарелке нет столько еды.");
            return false;
        }
        else {
            currentFoodAmount -= foodAmount;
            return true;
        }
    }
}
