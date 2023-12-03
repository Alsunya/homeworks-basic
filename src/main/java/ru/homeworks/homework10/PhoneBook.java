package src.main.java.ru.homeworks.homework10;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String phone){
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phone);
    }

    public ArrayList<String> find(String name){
        return phoneBook.get(name);
    }

    public boolean containsPhoneNumber(String phone){
        return phoneBook.values().toString().contains(phone);
    }

    public HashMap<String, ArrayList<String>> getPhoneBook() {
        return phoneBook;
    }
}
