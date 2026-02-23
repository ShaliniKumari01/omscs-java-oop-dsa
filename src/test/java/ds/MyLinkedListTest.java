package ds;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void addAndGetWorks() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(3, list.size());
        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));
    }

    @Test
    void addFirstWorks() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.addFirst(5);

        assertEquals(3, list.size());
        assertEquals(5, list.get(0));
        assertEquals(10, list.get(1));
        assertEquals(20, list.get(2));
    }

    @Test
    void removeFirstWorksAndThrowsOnEmpty() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);

        assertEquals(1, list.removeFirst());
        assertEquals(1, list.size());
        assertEquals(2, list.removeFirst());
        assertTrue(list.isEmpty());

        assertThrows(NoSuchElementException.class, list::removeFirst);
    }

    @Test
    void getOutOfBoundsThrows() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("X");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }
}