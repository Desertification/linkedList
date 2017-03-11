package myLinkedList;

/**
 * Created by thoma on 17-Feb-17.
 */
public class LinkedList<T> {
    private Node head;
    private int size;

    /**
     * Constructor of an empty list
     */
    public LinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Constructor for the linked list
     *
     * @param element generic
     */
    public LinkedList(T element) {
        head = new Node(element);
        size = 1;
    }

    private LinkedList(Node node) {
        head = node;
        size = count(head, 0);
    }

    /**
     * prepends the element to the linked list
     *
     * @param element generic
     */
    public void prepend(T element) {
        head = new Node(element, head);
        size++;
    }

    public void append(T element) {
        lastNode().next = new Node(element);
        size++;
    }

    private Node lastNode() {
        Node cursor = head;
        while (cursor.next() != null) {
            cursor = cursor.next();
        }
        return cursor;
    }

    /**
     * @return the head of the list
     */
    public T first() {
        if (head == null) {
            return null;
        } else {
            return head.get();
        }
    }

    /**
     * @return the last element of the list
     */
    public T last() {
        return lastRecusive(head).get();
    }

    private Node lastRecusive(Node current) {
        if (current.next() == null) {
            return current;
        }
        return lastRecusive(current.next());
    }

    /**
     * find the element in the list
     *
     * @param element to find
     * @return true if element is in the list
     */
    public boolean find(T element) {
        Node cursor = head;
        do {
            if (cursor.get().equals(element)) {
                return true;
            }
        } while (cursor.next() != null);
        return false;
    }

    /**
     * @return the linked list without the head element
     */
    public LinkedList<T> tail() {
        return new LinkedList<T>(head.next());
    }

    /**
     * @return true if empty, false if the linked list contains elements
     */
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int countRecusive(Node current, int total) {
        if (current == null) {
            return 0;
        } else if (current.next() != null) {
            total++;
            return countRecusive(current.next(), total);
        } else {
            return total;
        }
    }

//    private int count(){
//        if (head == null){
//            return 0;
//        }
//        int total = 1;
//        while(head.next() != null){
//            total++;
//        }
//        return total;
//        return countRecusive(head,1);
//    }

    // teacher solution
    private int count(Node current, int total) {
        if (current == null) {
            return total;
        }
        return count(current.next(), ++total);
    }

    private class Node {
        private T element;
        private Node next;

        public Node(T element) {
            this(element, null);
        }

        public Node(T element, Node next) {
            this.element = element;
            this.next = next;
        }

        public T get() {
            return element;
        }

        public Node next() {
            return next;
        }
    }


}
