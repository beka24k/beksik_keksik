public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer[] arr = {5, 8, 5, 9,1};
        MyArrayList mc = new MyArrayList(arr, 5);
        mc.sort();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        if (mc.contains(9)) {
            System.out.println("sajd");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print(mc.indexOf(5));
        System.out.print(mc.lastIndexOf(5));
    }
}