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
        System.out.println(queue.dequeue()); // should print 1
        System.out.println(queue.dequeue()); // should print 2
        System.out.println(queue.isEmpty()); // should print true
        System.out.println(queue.size()); // should print 0
        MyArrayListStack<Integer> stack = new MyArrayListStack<Integer>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek()); // should print 2
        System.out.println(stack.pop()); // should print 2
        System.out.println(stack.pop()); // should print 1
        System.out.println(stack.isEmpty()); // should print true
        System.out.println(stack.getSize()); // should print 0
    }

}

