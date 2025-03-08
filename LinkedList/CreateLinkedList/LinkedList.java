package CreateLinkedList;

// LinkedList.java
public class LinkedList {
    private Node head; // Reference to the first node
    private Node tail; // Reference to the last node
    int size = 0;

    // Constructor to initialize an empty LinkedList
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }
    // if we have only head and insert node end of the list
    public void insertAtEndWithHead(Node head, int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = temp;

    }

    // Method to insert a node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        // For an empty list
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // For a non-empty list
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Method to insert a node at start of the list

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        // For an Empty List
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            // For non-empty list
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Method to insert a node mid of list
    public void insertAt(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = head;

        if(idx == size){ // if idx is last node of list
            insertAtEnd(data);
            return;
        } else if (idx == 0) { // if idx is first node of list
            insertAtStart(data);
            return;
        } else if (idx < 0 || idx >size) {
            System.out.println("Wrong Index");
        }

        for(int i = 1; i <= idx-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Delete Node
    public void deleteAt(int idx){
        Node temp = head;
        for(int i = 0; i <= idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        tail = temp;
        size--;
    }

    // Get node data at any index
    public int getAt(int idx){
        if (idx < 0 || idx >= size) {
            System.out.println("out of index of list");
            return -1;
        }

        Node temp = head;
        for (int i = 1; i <=idx; i++) {
            temp = temp.next;
        }
        return temp.data;
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

    // Length of Linked List
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
