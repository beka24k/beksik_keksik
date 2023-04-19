public class MyLinkedList<T> implements Mylist<T> {
    private int size = 0;
    private MyNode head;
    private MyNode tail;

    public class MyNode {
        MyNode next;
        MyNode prev;
        T data;

        MyNode(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        MyNode curr = head;
        for (int i = 0; i < size; i++) {
            if (curr.data == o) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        if (index < size / 2) {
            MyNode curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            return curr.data;
        } else {
            MyNode curr = tail;
            for (int i = size - 1; i > index; i--) {
                curr = curr.prev;
            }
            return curr.data;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void add(Object item) {
        MyNode newNode = new MyNode((T) item);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(Object item, int index) {
        MyNode newNode = new MyNode((T) item);
        if (size == 0) {
            if (head == null) {
                add(item);
                return;
            }
        } else if (index == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            MyNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
        }
        size++;
    }

    @Override
    public boolean remove(Object item) {
        MyNode newNode = new MyNode((T) item);
        MyNode currentNode = head;
        while (currentNode != null && !currentNode.data.equals(item)) {
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            return false;
        } else if (currentNode == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (currentNode == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            currentNode.prev.next = currentNode.next;
            currentNode.next.prev = currentNode.prev;
        }
        size--;
        return true;
    }

    @Override
    public T remove2(int index) {
        T temp = get(index);
        remove(get(index));
        return temp;
    }

    @Override
    public int indexOf(Object o) {
        MyNode cur=head;
        int counter=0;
        for(int i=0;i<size;i++){
            counter++;
            if(cur.data.equals(0)){
                return counter;
            }
            cur=cur.next;
        }System.err.println("That object dont exist");
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        MyNode cur=head;
        int counter=size;
        for(int i=size-1;i>=0;i++){
            counter--;
            if(cur.data.equals(0)){
                return counter;
            }
            cur=cur.next;
        }System.err.println("That object dont exist");
        return -1;
    }
    @Override
    public void sort() {

    }
}