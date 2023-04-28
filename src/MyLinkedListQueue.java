import java.util.NoSuchElementException;

public class MyLinkedListQueue<E> {
    // Fields
    private MyLinkedList<E> queue;

    // Constructors

    /**
     * Constructs a new empty queue using a LinkedList.
     */
    public MyLinkedListQueue() {
        queue = new MyLinkedList<>();
    }

    // Methods

    /**
     * Adds the specified element to the back of the queue.
     *
     * @param element the element to be added to the queue.
     */
    public void enqueue(E element) {
        queue.add(element,size()-1);
    }

    /**
     * Removes and returns the front element of the queue.
     *
     * @return the front element of the queue.
     * @throws NoSuchElementException if the queue is empty.
     */
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.removed(0);
    }

    /**
     * Returns the front element of the queue without removing it.
     *
     * @return the front element of the queue.
     * @throws NoSuchElementException if the queue is empty.
     */
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

    /**
     * Returns true if the queue is empty, false otherwise.
     *
     * @return true if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        if (queue.size() == 0) return true;
        return false;
    }

    /**
     * Returns the number of elements in the queue.
     *
     * @return the number of elements in the queue.
     */
    public int size() {
        return queue.size();
    }
}
