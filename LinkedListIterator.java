package myLinkedList;

/**
 * Created by thoma on 14-Mar-17.
 * todo fix iterating and removing can cause nulpointer exception (fixable?)
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
            return !linkedList.isEmpty();
        } else {
            return !linkedList.isEmpty() && (!linkedList.tail().isEmpty());
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
