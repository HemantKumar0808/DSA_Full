package LinkedList;

public class SinglyLinkList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
//        while(head != null){
//            System.out.print(head.data + " ");
//            head = head.next;
//        }
        /* 1. A new reference temp is created to traverse the linked list in the first loop, leaving the original reference a intact.
           2. The temp reference is reset to the original reference a before the second loop. */
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }


    }

    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 3 9 8 16

//      ################# link - list  ##################

        a.next = b; // 5 -> 3 9 8 16
        b.next = c; // 5 -> 3 -> 9 8 16
        c.next = d; // 5 -> 3 -> 9 -> 8 16
        d.next = e; // 5 -> 3 -> 9 -> 8 -> 16

        display(a);
        display(a);
        display(a);

//        System.out.println(a.data);
//        System.out.println(b.data);
//        System.out.println(c.data);
//        System.out.println(d.data);
//        System.out.println(e.data);

//        ######################################################

////        print a
//        System.out.println(a.data);
////        print b
//        System.out.println(a.next.data); // System.out.println(b);
////        print c
//        System.out.println(a.next.next.data); // System.out.println(b.next.data);
////        print d
//        System.out.println(a.next.next.next.data);
////        print e
//        System.out.println(a.next.next.next.next.data);

//        ############# Print by For Loop #################

//        Node temp = a;
//        for (int i = 1; i <= 5 ; i++) {
//            System.out.print(temp.data+ " ");
//            temp = temp.next;
//        }

//        for (int i = 1; i <= 5 ; i++) {
//            System.out.print(a.data+ " ");
//            a = a.next;
//        }

//        ############ Print by While Loop ############
//        First loop
//        while(a != null){
//            System.out.print(a.data + " ");
//            a = a.next;
//        }
        /* 1. A new reference temp is created to traverse the linked list in the first loop, leaving the original reference a intact.
           2. The temp reference is reset to the original reference a before the second loop. */

//        Second loop
//      Reset `temp` to `a` for the second loop

//        Node temp = a;

//        while(temp != null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }








    }
}
