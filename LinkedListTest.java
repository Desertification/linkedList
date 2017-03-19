package myLinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by thoma on 05-Mar-17.
 */
class LinkedListTest {
    LinkedList<String> linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList<String>("1");
    }

    @Test
    void iterator() {
        Iterator<String> iterator = linkedList.iterator();
        assertEquals("1", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void remove() {
        linkedList.append("2");
        linkedList.append("3");

        linkedList.remove("2");

        assertEquals("1", linkedList.first());
        linkedList = linkedList.tail();
        assertEquals("3", linkedList.first());
    }

    @Test
    void removeMultiple() {
        linkedList.append("2");
        linkedList.append("3");
        linkedList.append("4");

        linkedList.remove("2");
        assertEquals("1", linkedList.first());
        linkedList.remove("1");
        assertEquals("3", linkedList.first());
        linkedList.remove("4");
        assertEquals("3", linkedList.first());
    }

    @Test
    void prepend() {
        linkedList.prepend("2");
        assertEquals("2", linkedList.first());
        assertEquals(2, linkedList.size());
    }

    @Test
    void append() {
        linkedList.append("2");
        assertEquals("1", linkedList.first());
        assertEquals("2", linkedList.last());
        assertEquals(2, linkedList.size());
    }

    @Test
    void appendWhenEmpty() {
        linkedList = new LinkedList<>();
        linkedList.append("1");
        assertEquals("1", linkedList.first());
        assertEquals(1, linkedList.size());
    }

    @Test
    void first() {
        assertEquals("1", linkedList.first());
        assertEquals(false, linkedList.isEmpty());
    }

    @Test
    void last() {
        assertEquals("1", linkedList.last());
        linkedList.prepend("2");
        assertEquals("2", linkedList.first());
        assertEquals("1", linkedList.last());
    }

    @Test
    void any() {
        assertTrue(linkedList.any("1"));
    }

    @Test
    void tail() {
        linkedList.prepend("2");
        LinkedList<String> result = linkedList.tail();
        assertEquals("1", result.first());
        assertEquals(1, result.size());
    }

    @Test
    void testTailWithOneElement() {
        LinkedList<String> result = linkedList.tail();
        assertEquals(null, result.first());
        assertEquals(0, result.size());
    }

    @Test
    void size() {
        assertEquals(1, linkedList.size());
    }

    @Test
    void isEmpty() {
        LinkedList<String> linkedList = new LinkedList<>();
        assertEquals(0, linkedList.size());
        assertEquals(true, linkedList.isEmpty());
    }

}