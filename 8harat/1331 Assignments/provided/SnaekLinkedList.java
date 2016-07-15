import java.util.Iterator;

/**
 * Snaek Linked List implementation of the SinglyLinkedList interface
 *
 * @author Shashank Singh
 * @author YOUR NAME
 * @author Severus Snaek
 * @version 1.0
 */
public class SnaekLinkedList implements SinglyLinkedList {

    // DO NOT MODIFY THESE VARIABLE NAMES
    private SnaekNode head;
    private SnaekNode tail;
    private int size;

    @Override
    public Iterator<Position> iterator() {
        return new Iterator<Position>() {
            private SnaekNode iter = head;

            @Override
            public boolean hasNext() {
                return iter != null;
            }

            @Override
            public Position next() {
                Position p = iter.getPosition();
                iter = iter.getNext();
                return p;
            }
        };
    }
}
