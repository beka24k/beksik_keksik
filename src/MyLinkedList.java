public class MyLinkedList<T> implements Mylist<T> {
    private int size = 0;
    private MyNode head;
    private MyNode tail;

    /*
    int size()
    @return the number of elements in this list.

    boolean contains(Object o)
    Returns true if this list contains the specified element.
    @parameters:
    o - element whose presence in this list is to be tested.

    T get(int index)
    Returns the element at the specified position in this list.
    Parameters:
    index - index of the element to return.
    @return:
    the element at the specified position in this list.

    void add(Object item)
    Appends the specified element to the end of this list.
    @parameters:
    item - element to be appended to this list.

    void add(Object item, int index)
    Inserts the specified element at the specified position in this list.
    @parameters:
    item - element to be inserted.
    index - index at which the specified element is to be inserted.

    boolean remove(Object item)
    Removes the first occurrence of the specified element from this list, if it is present.
    @parameters:
    item - element to be removed from this list, if present.
    @return:
    true if this list contained the specified element, false otherwise.

    T remove2(int index)
    Removes the element at the specified position in this list and returns the removed element.
    @parameters:
    index - the index of the element to be removed.
    @return:
    the removed element.

    int indexOf(Object o)
    Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
    @parameters:
    o - element to search for.
    @return:
    the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.

    int lastIndexOf(Object o)
    Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
    @parameters:
    o - element to search for.
    @return:
    the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.

    void sort()
    Sorts this list according to the natural order of the elements.
    Note: This method assumes that all elements in the list implement the Comparable interface.

    void clear()
    Removes all of the elements from this list.
    */
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
        checkIndex(index);//checking indexes
        if (index < size / 2) {//perfomance divide for big lists
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
        if (index < 0 || index >= size) {//checker
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void add(Object item) {
        MyNode newNode = new MyNode((T) item);
        if (size == 0) {//empty list
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
            if (head == null) {//empty list
                add(item);
                return;
            }
        } else if (index == 0) {//begining of list
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {//for middlie of head to tail
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
    public T removed(int index) {//remove ->removed -confuse when using integers
        T temp = get(index);
        remove(get(index));
        return temp;
    }

    @Override
    public int indexOf(Object o) {
        MyNode cur = head;
        for (int i = 0; i < size; i++) {
            if (cur.data.equals(o)) {
                return i;
            }
            cur = cur.next;
        }
        System.err.println("That object dont exist");
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        MyNode cur = tail;
        int counter = size;
        for (int i = size - 1; i >= 0; i--) {
            if (cur.data.equals(o)) {
                return i;
            }
            cur = cur.prev;

        }
        System.err.println("That object dont exist");
        return -1;
    }

    @Override
    public void sort() {
        if (size <= 1) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            MyNode curr = head;
            while (curr.next != null) {
                if (((Comparable<T>) curr.data).compareTo(curr.next.data) > 0) {
                    // Swap elements
                    T temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped);
    }

    @Override
    public void clear() {
        // Set head and tail to null, effectively removing all nodes
        head = null;
        tail = null;
        // Set size to 0
        size = 0;
    }
}