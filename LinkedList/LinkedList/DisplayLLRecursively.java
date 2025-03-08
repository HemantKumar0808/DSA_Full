package LinkedList;

public class DisplayLLRecursively {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
//    Print Linked List
    public static void displayr(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        displayr(head.next);
    }
//    Print Linked List Reverse
    public static void displayReverse(Node head){
        if(head == null){
            return;
        }
        displayr(head.next);
        System.out.print(head.data + " ");
    }
//    Print Linked List Length
    public static int length(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
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

        displayr(a);
        System.out.println();
        displayReverse(a);
        System.out.println();
        System.out.println(length(a));
}
}
