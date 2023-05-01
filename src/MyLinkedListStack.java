import java.util.EmptyStackException;

public class MyLinkedListStack<T> {
    // Fields
    private MyLinkedList<T> stack;
    // Constructors

    /**
     * Constructs a new empty stack using a linked list.
     */
    public MyLinkedListStack() {
        stack = new MyLinkedList<>();
    }

// Methods

    /**
     * Adds the specified element to the top of the stack.
     *
     * @param element the element to be added to the stack.
     */
    public void push(T element) {
        stack.addFirst(element);
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * @return the top element of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removed(0);
    }

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return the top element of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(0);
    }

    /**
     * Returns true if the stack is empty, false otherwise.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        if (stack.size() == 0) return true;
        return false;
    }

    /**
     * Returns the number of elements in the stack.
     *
     * @return the number of elements in the stack.
     */
    public int size() {
        return stack.size();
    }
}