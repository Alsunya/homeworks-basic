package src.main.java.ru.homeworks.homework4;

/* ТЗ: Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email;
 Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта;
 В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе;
 В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и с помощью цикла
 выведите информацию только о пользователях старше 40 лет.*/
public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int birthYear;
    private String email;

    public User(String surname, String name, String patronymic, int birthYear, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.email = email;
    }
    public void info(){
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("e-mail: " + email);
        System.out.println();
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getEmail() {
        return email;
    }
}
