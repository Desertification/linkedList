package myLinkedList;

/**
 * Created by thoma on 23-Apr-17.
 */
public interface Stack<E> {
    /**
     * @return the number of elements on the stack
     */
    int size();

    /**
     * @return if the stack contains no elements or not
     */
    boolean isEmpty();

    /**
     * Push an element on the stack
     * @param element to push on the stack
     */
    void push(E element);

    /**
     * Get the top element without removing it from the stack
     * @return the top element
     */
    E top();

    /**
     * Remove the top element of the stack and return it
     * @return the top element
     */
    E pop();

}
