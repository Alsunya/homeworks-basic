package src.main.java.ru.homeworks.homework4;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        User[] arrayUsers = {
                new User("Иванов", "Иван", "Иванович",
                        1990, "ivanov@example.com"),
                new User("Петров", "Петр", "Петрович",
                        1995, "petrov@example.com"),
                new User("Сидоров", "Алексей", "Павлович",
                        1985, "sidorov@example.com"),
                new User("Смирнов", "Александр", "Сергеевич",
                        1982, "smirnov@example.com"),
                new User("Кузнецова", "Мария", "Алексеевна",
                        1991, "kuznetsova@example.com"),
                new User("Волков", "Дмитрий", "Николаевич",
                        1988, "volkov@example.com"),
                new User("Ткаченко", "Анастасия", "Ивановна",
                        1996, "tkachenko@example.com"),
                new User("Коваленко", "Андрей", "Сергеевич",
                        1984, "kovalenko@example.com"),
                new User("Сорокина", "Екатерина", "Владимировна",
                        1993, "sorokina@example.com"),
                new User("Березин", "Максим", "Михайлович",
                        1989, "berezin@example.com")
        };
        for (User user : arrayUsers) {
            if(Year.now().getValue() - user.getBirthYear() > 40) {
                user.info();
            }
        }
        Box box = new Box(3, 6, "белый");
        box.info();
        box.put("игрушка");
        box.put("мяч");
        box.takeOut("игрушка");
        box.close();
        box.setColor("розовый");
        box.put("ручка");
        box.open();
        box.put("телефон");
        box.info();
    }
}
