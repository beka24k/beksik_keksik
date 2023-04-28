import java.util.EmptyStackException;

public class MyArrayListStack<E> {
    // Fields
    private MyArrayList<E> stack;

    // Constructors

    /**
     * Constructs a new empty stack using an ArrayList.
     */
    public MyArrayListStack() {
        stack = new MyArrayList<>();
    }

    // Methods

    /**
     * Adds the specified element to the top of the stack.
     *
     * @param element the element to be added to the stack.
     */
    public void push(E element) {
        stack.add(element);
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * @return the top element of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removed(stack.size() - 1);
    }

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return the top element of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
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
