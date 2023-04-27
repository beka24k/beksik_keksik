import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MyLinkedListQueue<Integer> queue = new MyLinkedListQueue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.peek()); // should print 1

    }
}

