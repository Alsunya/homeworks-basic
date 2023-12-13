package src.main.java.ru.homeworks.homework11;

public class MyStack<T> extends MyLinkedList{
    public void push(T data){
        addLast(data);
    }

    public T pop(){
        T removedData = (T) getLast();
        remove(size - 1);
        return removedData;
    }
}
