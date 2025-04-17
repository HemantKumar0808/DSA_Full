package CreateLinkedList;

// LinkedList.java
public class LinkedList {

    int size = 0;
    private Node head; // reference to the first node
    private Node tail; // reference to the last node


    //  Constructor to initialize an empty LinkedList
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    //  Method to insert a node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) { //  if our list is empty then add first node
            head = newNode;
//            tail = newNode;
        } else { // for non-empty list
            tail.next = newNode;
//            tail = newNode;
        }
        tail = newNode;
        size++;
    }

    // Method to display the contents of the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to display the contents of the list
    public void displayReverse() {
        displayReverseHelper(head);
        System.out.println();
    }

    private void displayReverseHelper(Node head) {
        if (head == null) return;
        displayReverseHelper(head.next);
        System.out.print(head.data + " ");
    }


    // Method to insert a node mid of list
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) { // empty list
//            head = newNode;
//            tail = newNode;
            head = tail = newNode;
        } else { // non-empty list
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Method to insert a node mid of list
    public void insertAt(int idx, int data) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);

        if (idx == 0) {
            insertAtStart(data);
            return;
        }

        if (idx == size) {
            insertAtEnd(data);
            return;
        }

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Get node data at any index
    public int getAt(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("out of index of list");
            return -1;
        }

        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Delete Node
    public void deleteAt(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index");
            return;
        }

        // Deleting head node
        if (idx == 0) {
            head = head.next;
            if (head == null) tail = null; // List empty ho gayi
            size--;
            return;
        }

        // Deleting from middle or end
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        // If last node is deleted, update tail
        if (temp.next == null) {
            tail = temp;
        }

        size--;
    }


//    public int size(){
//        Node temp = head;
//        int count = 0;
//        while(temp != null){
//            count++;
//            temp = temp.next;
//        }
//        return count;
//    }


}