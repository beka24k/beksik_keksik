import java.util.EmptyStackException;

public class MyArrayListStack<T>  {

    private MyArrayList arr;

    public MyArrayListStack() {
        arr = new MyArrayList<T>();
    }

    public void push(T item) {
        arr.add(item, 0);
    }
    public T pop() {
        return (T) arr.removed(0);

    }


    public T peek() {
        return (T) arr.get(0);
    }

    public boolean isEmpty() {
        if (arr.size() == 0) return true;
        return false;
    }

    public int getSize() {
        return arr.size();
    }

}
