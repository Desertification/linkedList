import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by thoma on 17-Feb-17.
 */
class LinkedListTest {
    @Test
    void tail() {
        linkedList.prepend("2");
        LinkedList<String> result = linkedList.tail();
        Assert.assertEquals("1", result.first());
        Assert.assertEquals(1, result.size());
    }

    LinkedList<String> linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList<String>("1");
    }

    @org.junit.jupiter.api.Test
    void testEmptyList() {
        LinkedList<String> linkedList = new LinkedList<>();
        Assert.assertEquals(0, linkedList.size());
        Assert.assertEquals(true, linkedList.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void prepend() {
        linkedList.prepend("2");
        Assert.assertEquals("2", linkedList.first());
        Assert.assertEquals(2, linkedList.size());
    }

    @org.junit.jupiter.api.Test
    void first() {
        Assert.assertEquals("1", linkedList.first());
        Assert.assertEquals(1, linkedList.size());
        Assert.assertEquals(false, linkedList.isEmpty());
    }
}
