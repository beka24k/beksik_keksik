public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer[] arr = {5, 8, 5, 9, 1};
        MyArrayList<Integer> mc = new MyArrayList<>(arr);
        System.out.println(mc.size());
        mc.add(45);
        mc.add(85575);
        mc.add(74,5);
        if(mc.contains(45)) System.out.print("lksd");
        int temp=mc.removed(3);
        if(mc.remove(1)) System.out.println("hey correct");
        for (int i = 0; i < mc.size(); i++) {
            System.out.print(mc.get(i) + " ");

        }
        System.out.println(mc.size());
        mc.clear();
        System.out.println(mc.size());
        for (int i = 0; i < mc.size(); i++) {
            System.out.print(mc.get(i) + " ");

        }

    }
}
