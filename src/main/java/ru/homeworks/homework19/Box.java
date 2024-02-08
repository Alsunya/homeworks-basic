package ru.homeworks.homework19;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;
    public Box(List<T> fruits) {
        this.fruits = new ArrayList<>(fruits);
    }
    public void addFruit(T fruit){
        this.fruits.add(fruit);
    }
    public Integer weight(){
        int weight = 0;
        for (T fruit: this.fruits) {
            weight += fruit.weight;
        }
        return weight;
    }
    public boolean compare(Box box){
        return this.weight().equals(box.weight());
    }
    public void putInto(Box<T> box){
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
