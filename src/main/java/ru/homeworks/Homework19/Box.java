package src.main.java.ru.homeworks.Homework19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<C extends Fruit> {
    private List<C> fruits;
    @SafeVarargs
    public Box(C... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }
    public void addFruit(C fruit){
        this.fruits.add(fruit);
    }
    public Integer weight(){
        int weight = 0;
        for (C fruit: this.fruits) {
            weight += fruit.weight;
        }
        return weight;
    }
    public boolean compare(Box box){
        return this.weight().equals(box.weight());
    }
    public void putInto(Box<C> box){
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
