package ds;

import java.util.NoSuchElementException;

public class MyQueue<T> {

    private Node<T> head; // front (remove from here)
    private Node<T> tail; // rear (add here)
    private int size = 0;

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public T dequeue() {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");

        T value = head.value;
        head = head.next;
        size--;

        if (head == null) { // queue became empty
            tail = null;
        }

        return value;
    }

    public T peek() {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");
        return head.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
