public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer[] arr = {1, 8, 5, 9};
        MyArrayList mc = new MyArrayList(arr, 4);
        mc.sort();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        if (mc.contains(9)) {
            System.out.println("sajd");
        }
        mc.add(10, 2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println(mc.get(4));
    }
}