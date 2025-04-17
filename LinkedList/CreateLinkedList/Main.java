package CreateLinkedList;
// Main.java
public class Main {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.insertAtEnd(3);
        ll.insertAtEnd(2);
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.display();
        ll.displayReverse();
//        System.out.println(ll.size());
        ll.insertAt(3,10);
        ll.display();
        System.out.println(ll.size);
        ll.deleteAt(1);
        ll.display();

    }
}
