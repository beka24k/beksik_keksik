public class MyArrayList<T> implements Mylist<T> {
    private T[] arr;
    private int size;

    MyArrayList(T[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    @Override
    public int size() {
        return size-1;
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
        if (size==arr.length) {
            arrayMakeBigger();
        }arr[size-1] = item;
        size++;
    }

    @Override
    public void add(T item, int index) {
        checkIndex(index);
        arrayMakeBigger();
        for (int i = arr.length / 2 - 1; i > index; i--) {
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

        arr=arr2;
    }
    public Object get(int index) {
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
    public void remove2(int index) {
        checkIndex(index);
        T[] newArr = (T[]) new Object[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
        for(int i=0;i<size;i++){
            arr[i]=newArr[i];
        }
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
            int[] temp = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = (Integer) arr[i];
            }
            mergeSort(temp, 0, temp.length - 1);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (T) (Integer) temp[i];
            }
        } else {
            System.out.println("bobo is not a Integer");
        }

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