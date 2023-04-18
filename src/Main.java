import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer[] arr={1,8,5,9};
        MyArrayList mc=new MyArrayList(arr);
        mc.sort();
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }



}