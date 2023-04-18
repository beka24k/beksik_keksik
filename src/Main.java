public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer[] arr = {5, 8, 5, 9, 1};
        MyArrayList<Integer> mc = new MyArrayList<>(arr, 5);
        mc.add(10);
        mc.add(18);
        mc.add(48,2);
        if(mc.contains(48)) System.out.println("lksd");
        System.out.println(mc.get(5));
        for (int i = 0; i < mc.size(); i++) {
            System.out.print(mc.get(i) + " ");
        }
    }
}
