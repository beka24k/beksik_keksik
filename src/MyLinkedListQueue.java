import java.util.NoSuchElementException;

public class MyLinkedListQueue<T> {
    private MyLinkedList<T> list;

    public MyLinkedListQueue() {
        list = new MyLinkedList<T>();
    }

    public void enqueue(T item) {
        list.add(item, list.size() - 1);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.removed(0);
    }

}

