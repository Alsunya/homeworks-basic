package src.main.java.ru.homeworks.homework4;

/*ТЗ: Попробуйте реализовать класс по его описанию: объекты класса Коробка должны иметь размеры и цвет.
 Коробку можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после создания нельзя.
 У коробки должен быть метод, печатающий информацию о ней в консоль. В коробку можно складывать предмет
 (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть),
 только при условии что коробка открыта (предметом читаем просто строку).
 Выполнение методов должно сопровождаться выводом сообщений в консоль.*/
public class Box {
    private final int width;
    private final int length;
    private String color;
    private boolean isOpen = true;
    private String content;

    public Box(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public void open(){
        if(!isOpen){
            isOpen = true;
            System.out.println("Вы открыли коробку");
        }
        else {
            System.out.println("Коробка уже и так открыта");
        }
    }

    public void close(){
        if(isOpen){
            isOpen = false;
            System.out.println("Вы закрыли коробку");
        }
        else{
            System.out.println("Коробка уже и так закрыта");
        }
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Вы перекрасили коробку в " + color);
    }

    public void info(){
        System.out.println("Размер коробки: " + length + " х " +  width);
        System.out.println("Цвет коробки: " + color);
        if (isOpen){
            System.out.println("Коробка открыта");
        }
        else{
            System.out.println("Коробка закрыта");
        }
        if(content != null){
            System.out.println("В коробке лежит " + content);
        }
        else {
            System.out.println("В коробке пусто");
        }
        System.out.println("");
    }

    public void put(String object){
        if(content == null && isOpen){
            content = object;
            System.out.println("Вы положили в коробку объект " + object);
        } else if (content != null) {
            System.out.println("В коробке уже лежит " + content);
        } else {
            System.out.println("Сначала откройте коробку");
        }
    }

    public void takeOut(String object){
        if(content == null){
            System.out.println("В коробке нет объекта " + object);
        } else if(content.equals(object) && isOpen){
            content = null;
            System.out.println("Вы достали объект " + object + " из коробки");
        } else if (!content.equals(object)){
            System.out.println("В коробке нет объекта " + object + ", там лежит " + content);
        }
        else{
            System.out.println("Сначала откройте коробку");
        }
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getContent() {
        return content;
    }
}
