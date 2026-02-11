package ds;

import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void enqueueAndPeekWorks() {
        MyQueue<Integer> q = new MyQueue<>();
        q.enqueue(10);
        q.enqueue(20);

        assertEquals(2, q.size());
        assertEquals(10, q.peek()); // FIFO: first is still at front
    }

    @Test
    void dequeueReturnsFirstEnqueued() {
        MyQueue<String> q = new MyQueue<>();
        q.enqueue("A");
        q.enqueue("B");

        assertEquals("A", q.dequeue());
        assertEquals("B", q.dequeue());
        assertTrue(q.isEmpty());
    }

    @Test
    void dequeueOnEmptyThrows() {
        MyQueue<Integer> q = new MyQueue<>();
        assertThrows(NoSuchElementException.class, q::dequeue);
    }
}
