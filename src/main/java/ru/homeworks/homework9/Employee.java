package src.main.java.ru.homeworks.homework9;

public record Employee(String name, int age) {

    @Override
    public String toString() {
        return "Имя: " + name + ", возраст: " + age;
    }
}
