package src.main.java.ru.homeworks.homework13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) throws IOException {
        int portNumber = 8888;

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            System.out.println("Сервер запущен. Ожидание подключений...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Клиент подключен: " + clientSocket);

                handleClient(clientSocket);

                System.out.println("Клиент отключен: " + clientSocket);
                clientSocket.close();
            }
        } catch (IOException e) {
            System.err.println("Ошибка сервера: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) {
        try (
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())) ) {
            out.println("Доступные операции: +, -, *, /");

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.equalsIgnoreCase("exit")) {
                    out.println("Работа завершена. Для нового расчета подключитесь заново.");
                    break;
                }

                String[] tokens = inputLine.split(" ");
                if (tokens.length == 3) {
                    double num1 = Double.parseDouble(tokens[0]);
                    double num2 = Double.parseDouble(tokens[1]);
                    String operation = tokens[2];

                    double result = switch (operation) {
                        case "+" -> num1 + num2;
                        case "-" -> num1 - num2;
                        case "*" -> num1 * num2;
                        case "/" -> num1 / num2;
                        default -> 0.0;
                    };
                    out.println("Результат: " + result);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка обработки клиента: " + e.getMessage());
        }
    }
}
