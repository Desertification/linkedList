package myLinkedList;

/**
 * Created by thoma on 14-Mar-17.
 * interface to enable easy iteration of custom collection
 */
public interface Iterator<T> {
    /**
     * @return true if there is still an object int the collection
     */
    boolean hasNext();

    /**
     * @return the next object in the collection
     */
    T next();
}
