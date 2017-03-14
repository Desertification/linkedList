package myLinkedList;

/**
 * Created by thoma on 14-Mar-17.
 */
public class LinkedListIterator<T> implements Iterator<T> {
    private LinkedList<T> linkedList;
    private boolean firstIteration = true;

    public LinkedListIterator(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public boolean hasNext() {
        if (firstIteration) {
            return linkedList.size() != 0;
        } else {
            return linkedList.tail().size() != 0;
        }
    }

    @Override
    public T next() {
        if (firstIteration) {
            firstIteration = false;
        } else {
            linkedList = linkedList.tail();
        }
        return linkedList.first();
    }
}
