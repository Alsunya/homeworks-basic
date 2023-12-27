package src.main.java.ru.homeworks.homework11;

class MyLinkedList<T> {
    protected Node<T> head;
    protected int size;
    protected static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
        }
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public T getFirst() {
        if (head == null) {
            throw new IllegalStateException("Collection is empty");
        }
        return head.data;
    }

    public T getLast() {
        if (head == null) {
            throw new IllegalStateException("Collection is empty");
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    public void add(int position, T data){
        if (position < 0 || position > size){
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (position == 0) {
            addFirst(data);
        } else {
            Node<T> newNode = new Node<>(data);
            Node<T> current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    public T remove(int position){
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (position == 0) {
            T removedData = head.data;
            head = head.next;
            size--;
            return removedData;
        } else {
            Node<T> current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            T removedData = current.next.data;
            current.next = current.next.next;
            size--;
            return removedData;
        }
    }

    public T get(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        Node<T> current = head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            str.append("[").append(current.data).append("] ");
            current = current.next;
        }
        return str.toString();
    }
}
