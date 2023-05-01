import java.util.NoSuchElementException;

public class MyArrayListQueue<T> {
    // Fields
    private MyArrayList<T> queue;
    // Constructors

    /**
     * Constructs a new empty queue using an ArrayList.
     */
    public MyArrayListQueue() {
        queue = new MyArrayList<>();
    }

    // Methods

    /**
     * Adds the specified element to the back of the queue.
     *
     * @param element the element to be added to the queue.
     */
    public void enqueue(T element) {
        queue.add(element);
    }

    /**
     * Removes and returns the front element of the queue.
     *
     * @return the front element of the queue.
     * @throws NoSuchElementException if the queue is empty.
     */
    public T dequeue() {
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
    public T peek() {
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