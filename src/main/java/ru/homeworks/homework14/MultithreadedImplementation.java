package src.main.java.ru.homeworks.homework14;

public class MultithreadedImplementation {
    public static void main(String[] args) throws InterruptedException {
        long time = System.currentTimeMillis();
        double[] array = new double[100_000_000];

        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 25_000_000; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 25_000_001; i <= 50_000_000; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 50_000_001; i <= 75_000_000; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 75_000_001; i < 100_000_000; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Время выполнения: " + (System.currentTimeMillis() - time));
    }
}
