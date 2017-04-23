package myLinkedList;

/**
 * Created by thoma on 23-Apr-17.
 */
public class StackImp<E> {
    private LinkedList<E> list;

    public StackImp() {
        list = new LinkedList<E>();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void push(E element) {
        list.prepend(element);
    }

    public E top() {
        if (isEmpty()) {
            return null;
        }
        return list.first();
    }

    public E pop() {
        if (top() == null) {
            return null;
        }
        E head = list.first();
        list = list.tail();
        return head;
    }
}
