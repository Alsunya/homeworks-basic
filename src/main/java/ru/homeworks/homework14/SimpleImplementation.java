package src.main.java.ru.homeworks.homework14;

public class SimpleImplementation {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        double[] array = new double[100_000_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        System.out.println("Время выполнения: " + (System.currentTimeMillis() - time));
    }
}
