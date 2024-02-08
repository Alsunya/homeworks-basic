package ru.homeworks.homework21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Цель: научиться распараллеливать исполнение задач в рамках одного приложения.
 * ТЗ:
 * Создайте пул потоков
 * Задайте пулу три задачи: первая должна 5 раз напечатать букву A, вторая - B, третья - C
 * Синхронизируйте потоки в пуле таким образом,
 * чтобы в любой ситуации в консоль печаталась последовательность ABCABCABCABCABC
 * После печати всех символов программа должна завершиться
 */
public class Main {
    private final Object monitor = new Object();
    private char currentLetter = 'A';
    public static void main(String[] args) throws InterruptedException {
        Main app = new Main();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(app::printA);
        executorService.execute(app::printB);
        executorService.execute(app::printC);
        executorService.shutdown();
    }

    public void printA() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'A') {
                        monitor.wait();
                    }
                    System.out.print("A");
                    currentLetter = 'B';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'B') {
                        monitor.wait();
                    }
                    System.out.print("B");
                    currentLetter = 'C';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'C') {
                        monitor.wait();
                    }
                    System.out.print("C");
                    currentLetter = 'A';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
