import java.util.EmptyStackException;

public class MyArrayListStack<T>  {

    MyArrayList arr;

    public MyArrayListStack() {
        arr = new MyArrayList();
    }

    public void push(T item) {
        arr.add(item, 0);
    }


}
