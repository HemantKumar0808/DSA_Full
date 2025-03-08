package LinkedList;

public class LinkedListBasic {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        System.out.println(a.data);
        System.out.println(a.next); // null

        Node b = new Node(3);
//        Node c = new Node(9);
//        Node d = new Node(8);
//        Node e = new Node(16);
//        // 5 3 9 8 16
        a.next = b; // 5 -> 3 9 8 16
        System.out.println(a.next); // $Node@6acbcfc0
        System.out.println(b); // $Node@6acbcfc0
        System.out.println(b.next); // null
//
//        b.next = c; // 5 -> 3 -> 9 8 16
//        System.out.println(b.next); // $Node@5f184fc6
//        System.out.println(c); // $Node@5f184fc6
//        System.out.println(c.next); // null
//
////        print data c
//        System.out.println(c.data);
//        System.out.println(b.next.data);
//
    }
}
