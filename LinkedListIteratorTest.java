package myLinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by thoma on 14-Mar-17.
 */
class LinkedListIteratorTest {
    private LinkedListIterator<String> linkedListIterator;

    @BeforeEach
    void setUp() {
        LinkedList<String> linkedList = new LinkedList<>("1");
        linkedList.append("2");
        linkedListIterator = new LinkedListIterator<>(linkedList);
    }

    @Test
    void hasNext() {
        assertTrue(linkedListIterator.hasNext());
        linkedListIterator.next();
        linkedListIterator.next();
        assertFalse(linkedListIterator.hasNext());
    }

    @Test
    void next() {
        assertEquals("1", linkedListIterator.next());
        assertEquals("2", linkedListIterator.next());
    }

}