public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer[] arr = {5, 8, 5, 9, 1};
        MyArrayList<Integer> mc = new MyArrayList<>(arr);
        mc.add(45);
        mc.add(85575);
        mc.add(74,5);

        if(mc.contains(48)) System.out.println("lksd");
        for (int i = 0; i < mc.size(); i++) {
            System.out.print(mc.get(i) + " ");
        }
    }
}
