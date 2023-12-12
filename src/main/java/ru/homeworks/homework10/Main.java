package src.main.java.ru.homeworks.homework10;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Владимир", "89037583478");
        phoneBook.add("Владимир", "89037433432");
        phoneBook.add("Роман", "89427846510");
        phoneBook.add("Ева", "89427284950");
        phoneBook.add("Роман", "89420937510");
        phoneBook.add("Владимир", "89037494272");

        System.out.println(phoneBook.find("Владимир"));
        System.out.println(phoneBook.find("Роман"));

        System.out.println(phoneBook.containsPhoneNumber("89037433432"));
        System.out.println(phoneBook.containsPhoneNumber("89037433431"));

        System.out.println(phoneBook.getPhoneBook());
    }
}
