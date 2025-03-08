import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList arrList = new ArrayList();
//        arraylist are index based data structure
        arrList.add(10);
        arrList.add(20);

        arrList.add(0,50);
        arrList.add(1,60);

//        arraylist can store different datatypes
        arrList.add(2,"hemu");
        arrList.add(3,2.6);

//        arraylist can store duplicate values
        arrList.add(30);
        arrList.add(30);

//        arraylist can store any number of Null values
        arrList.add(1,null);

        System.out.println(arrList);
//        arraylist follows the insertion order means
//        if we not provide index no. then already store in index sequence 0,1,2,3...


//        array list does not follows the sorting orders
//        like 10,13,24,54....so on


//      if we add first arraylist to second array list

        ArrayList first = new ArrayList();
        first.add(10);
        first.add(1200);
        first.add(100);
        first.add("hemu");

        ArrayList second = new ArrayList();
        second.add(20);
        second.add(1200);
        second.add("hemu sharma");
        second.add(150);

//        first.addAll(second); // var1.addAll(var2)
        second.addAll(first); // var1.addAll(var2)
        System.out.println(first);
        System.out.println(second);


//        remove element from index
//        first.remove(1);
//        System.out.println(first);

//        remove all from second array if they are same
//        first.removeAll(second);
//        System.out.println(first);
        second.removeAll(first);
        System.out.println(second);
//  clear
        second.clear();
        System.out.println(second);

//        if we check boolean value in the array list use var.containes
//        1. method
//        boolean check = first.contains("hemu");
//        System.out.print(check);
//        2. method
        System.out.print(first.contains("hemu"));



    }
}
