public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer[] arr = {5, 8, 5, 9, 1};
        MyArrayList<Integer> mc = new MyArrayList<>(arr);
        mc.add(45);
        mc.add(85575);
        mc.add(74,5);
        System.out.println(mc.size());
        if(mc.contains(48)) System.out.println("lksd");
        for (int i = 0; i < mc.size(); i++) {
            System.out.print(mc.get(i) + " ");

        }
    MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(15);
        linkedList.add(45);
        linkedList.add(78);
        linkedList.add(15);
        linkedList.add(98);
        System.out.println(linkedList.indexOf(98));
        System.out.println(linkedList.lastIndexOf(15));
        for(int i=0;i<linkedList.size();i++){
            System.out.print(linkedList.get(i)+" ");
        }
    }
}
