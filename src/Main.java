public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(45);
        linkedList.add(4);
        linkedList.add(1);
        linkedList.add(0);
        linkedList.add(75);
        linkedList.add(456,0);
        linkedList.removed(3);
        linkedList.remove(0);
        for(int i=0;i<linkedList.size();i++){
            System.out.print(linkedList.get(i)+" ");
        }
        System.out.println(linkedList.size());
        linkedList.clear();
        System.out.println(linkedList.size());
        for(int i=0;i<linkedList.size();i++){
            System.out.print(linkedList.get(i)+" ");
        }


    }
}
