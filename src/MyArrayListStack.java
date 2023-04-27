import java.util.EmptyStackException;

public class MyArrayListStack<T>  {

    MyArrayList arr;

    public MyArrayListStack() {
        arr = new MyArrayList();
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



}
