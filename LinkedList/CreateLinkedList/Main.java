package CreateLinkedList;
// Main.java
public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtEnd(9);
        ll.insertAtStart(6);
        ll.insertAt(2,11);
        ll.insertAt(0,20);
        ll.display();
//        System.out.println(ll.size());
        System.out.println(ll.size);
        System.out.println(ll.getAt(7));

    }
}
