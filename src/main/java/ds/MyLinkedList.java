package ds;

import java.util.NoSuchElementException;

public class MyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    // Add to end
    public void add(T item) {
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

    // Add to front
    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;

        if (tail == null) { // list was empty
            tail = newNode;
        }

        size++;
    }

    // Get item at index (0-based)
    public T get(int index) {
        checkIndex(index);

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    // Remove first element and return it
    public T removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException("List is empty");

        T value = head.value;
        head = head.next;
        size--;

        if (head == null) { // became empty
            tail = null;
        }

        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}
