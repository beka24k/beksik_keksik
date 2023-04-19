public class MyArrayList<T> implements Mylist<T> {
    private T[] arr;
    private int size;

    /*public int size()
    Returns the number of elements in this list.

    public boolean contains(Object o)
    Returns true if this list contains the specified element.
    @parameter:
    o: the element to search for in this list

    public void add(T item)
    Appends the specified element to the end of this list.
    @parameter:
    item: the element to be added to this list

    public void add(T item, int index)
    Inserts the specified element at the specified position in this list.
    @parameter:
    item: the element to be inserted into this list
    index: the index at which the specified element is to be inserted
    Throws:
    IndexOutOfBoundsException: if the index is out of range (index < 0 || index > size())

    public T get(int index)
    Returns the element at the specified position in this list.
    @parameter:
    index: the index of the element to be returned
    Throws:
    IndexOutOfBoundsException: if the index is out of range (index < 0 || index >= size())
    @return:
    the element at the specified position in this list

    public boolean remove(T item)
    Removes the first occurrence of the specified element from this list, if it is present.
    @parameter:
    item: the element to be removed from this list
    @return:
    true if this list contained the specified element, false otherwise

    public T remove2(int index)
    Removes the element at the specified position in this list.
    @parameter:
    index: the index of the element to be removed
    Throws:
    IndexOutOfBoundsException: if the index is out of range (index < 0 || index >= size())
    @return:
    the element that was removed from the list

    public int indexOf(Object o)
    Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
    @parameter:
    o: the element to search for in this list
    @return:
    the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element

    public int lastIndexOf(Object o)
    Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
    @parameter:
    o: the element to search for in this list
    @return:
    the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element

    public void sort()
    Sorts the elements in this list in ascending order.
    Throws:
    ClassCastException: if the elements are not mutually comparable

    public void clear()
    Removes all of the elements from this list.

    */
    MyArrayList(T[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        for (Object value : arr) {
            if (o.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void add(T item) {
        if (size == arr.length) {
            arrayMakeBigger();
        }
        arr[size++] = item;
    }

    @Override
    public void add(T item, int index) {
        checkIndex(index);
        if (size == arr.length) {
            arrayMakeBigger();
        }
        for (int i = size; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = item;
        size++;

    }

    private void arrayMakeBigger() {
        T[] arr2 = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = (T) arr[i];
        }
        arr = arr2;
    }

    public T get(int index) {
        checkIndex(index);
        return arr[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean remove(T item) {
        remove2(indexOf(item));
        return true;
    }

    @Override
    public T remove2(int index) {
        checkIndex(index);
        T temp = arr[0];
        T[] newArr = (T[]) new Object[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                temp = arr[index];
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
        for (int i = 0; i < size; i++) {
            arr[i] = newArr[i];
        }
        size--;
        return temp;
    }

    @Override
    public int indexOf(Object o) {

        for (int i = 0; i < size; i++) {
            if (arr[i] != null && arr[i].equals(o)) {
                return i;
            }
        }
        System.err.println("This element is not in array");
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (arr[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = size - 1; i >= 0; i--) {
                if (o.equals(arr[i])) {
                    return i;
                }
            }
        }
        return -1;
    }


    @Override
    public void sort() {
        if (arr[0] instanceof Integer) {
            int[] temp = new int[size];
            for (int i = 0; i < size; i++) {
                temp[i] = (Integer) arr[i];
            }
            mergeSort(temp, 0, temp.length - 1);
            for (int i = 0; i < size; i++) {
                arr[i] = (T) (Integer) temp[i];
            }
        } else {
            System.out.println("bobo is not a Integer");
        }

    }

    @Override
    public void clear() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (i = start; i <= end; i++) {
            arr[i] = temp[i - start];
        }
    }
}