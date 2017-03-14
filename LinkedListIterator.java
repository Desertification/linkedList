package myLinkedList;

/**
 * Created by thoma on 14-Mar-17.
 */
public class LinkedListIterator<T> implements Iterator<T> {
    private LinkedList<T> linkedList;

    public LinkedListIterator(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public boolean hasNext() {
        return linkedList.tail().size() != 0;
    }

    @Override
    public T next() {
        linkedList = linkedList.tail();
        return linkedList.first();
    }
}
