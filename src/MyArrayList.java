public class MyArrayList implements Mylist {
    private Object[] arr;

    MyArrayList(Object[] arr) {
        this.arr = arr;
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void add(Object item) {
        arr = arrayMakeBigger(arr);
        arr[arr.length / 2] = item;
    }

    @Override
    public void add(Object item, int index) {

    }

    private Object[] arrayMakeBigger(Object[] arr) {
        Object[] arr2 = new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public Object get(int index) {
        if (arr.length <= index) {
            System.err.println("Index out of bounds");
            return 0;
        } else {
            return arr[index];
        }
    }

    @Override
    public boolean remove(Object item) {
        return true;
    }

    private static int findIndex(Object[] arr, Object element) {
        for (int i = 0; i < arr.length; i++) {
            if (element.equals(arr[i])) {
                return i;
            }
        }
        return -1; // element not found in the array
    }

    @Override
    public Object remove(int index) {
        Object[] newArr = new Object[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
        arr = newArr;
        return arr;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {
        if (arr[0] instanceof Integer) {
            int[] temp=new int[arr.length];
            for (int i=0;i< arr.length;i++){
                temp[i]=(Integer) arr[i];
            }mergeSort(temp,0,temp.length-1);
            for (int i=0;i< arr.length;i++){
                arr[i]=temp[i];
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