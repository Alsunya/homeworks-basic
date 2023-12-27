package src.main.java.ru.homeworks.homework11;

import java.util.Arrays;


/**
Описание/Пошаговая инструкция выполнения домашнего задания:
- Написать свой класс MyLinkedList поддерживающий методы:
 - addFirst(T data) - добавляет элемент в начало списка, остальные сдвигаются вправо
 - addLast(T data) - добавляет элемент в конец списка
 - T getFirst() - возвращает первый элемент списка
 - T getLast() - возвращает последний элемент списка
 - add(int position, T data) - вставляет элемент на позицию с номером position, остальные элементы сдвигаются вправо
 - T remove(int position) - удаляет элемент с номером position
 - T get(int position) - возвращает элемент с номером posiion
 - int getSize() - возвращает количество элементов в списке.
- На основе разработанного MyLinkedList создать класс MyQueue работающий по принципу очереди, и имеющий два метода
 - offer(T data), добавляющий элемент в очередь
 - T poll() - забирающий элемент из очереди
- На основе разработанного MyLinkedList построить класс MyStack имеющий два метода
 - push(T data) - помещающий элемент в стек
 - T pop() - достающий элемент из стека
- Написать функцию int[] sort(int[] array) - возвращающий отсортированный по возрастанию массив.
 Готовыми методами сортировки не пользоваться - использовать алгоритм сортировки пузырьком
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst(3);
        myLinkedList.addLast(4);
        myLinkedList.add(1, 9);
        myLinkedList.add(0, 6);
        myLinkedList.add(4, 1);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList.getSize());
        System.out.println(myLinkedList.get(4));
        System.out.println(myLinkedList.remove(2));
        System.out.println(myLinkedList);


        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.offer(4);
        myQueue.offer(8);
        myQueue.offer(2);
        System.out.println(myQueue);
        System.out.println(myQueue.poll());
        System.out.println(myQueue);


        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(3);
        myStack.push(7);
        myStack.push(1);
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);


        int[] myArray = {10, 4, 5, 2, 8, 2, 1, 7, 9, 1, 0};
        System.out.println(Arrays.toString(Sort.sort(myArray)));
    }
}
