package src.main.java.ru.homeworks.homework13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Описание/Пошаговая инструкция выполнения домашнего задания "Клиент-серверное приложение "Калькулятор"":
 * Сервер: выполняет математические вычисления: +,-,*,/
 * Клиент-серверное взаимодействие:
 * клиент подключается к серверу, получает строку с доступными мат. операциями. Отображает ее пользователю.
 * пользователь вводит два числа и команду в консоль
 * отправляется запрос на сервер, сервер выполняет вычисления, возвращает результат клиенту.
 * клиент отображает результат в консоль
 */
public class Client {
    public static void main(String[] args) {
        String hostName = "localhost";
        int portNumber = 8888;

        try (
                Socket socket = new Socket(hostName, portNumber);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String fromServer;
            while (true) {
                fromServer = in.readLine();
                System.out.println("Сервер: " + fromServer);
                System.out.print("Введите два числа и операцию (например, 2 2 +): ");
                String userInput = stdIn.readLine();
                out.println(userInput);
                fromServer = in.readLine();
                System.out.println("Сервер: " + fromServer);
                break;
            }
        } catch (UnknownHostException e) {
            System.err.println("Неизвестный хост: " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Ошибка ввода/вывода: " + e.getMessage());
            System.exit(1);
        }
    }
}
