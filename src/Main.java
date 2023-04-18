public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer[] arr = {5, 8, 5, 9, 1};
        MyArrayList<Integer> mc = new MyArrayList<>(arr);
        mc.add(88,3);
        mc.add(48,2);
       mc.add(123);
       mc.add(124);
       mc.add(1234,6);
       mc.add(564);
        if(mc.contains(48)) System.out.println("lksd");
        for (int i = 0; i < mc.size(); i++) {
            System.out.print(mc.get(i) + " ");
        }
    }
}
