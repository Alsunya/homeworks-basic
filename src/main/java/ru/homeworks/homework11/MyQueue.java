package src.main.java.ru.homeworks.homework11;

public class MyQueue<T> extends MyLinkedList{
    public void offer(T data){
        addLast(data);
    }

    public T poll(){
        T removedData = (T) getFirst();
        remove(0);
        return removedData;
    }
}
