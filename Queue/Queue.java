import java.util.*;
public class Queue
{
    public static void main(String[] args) {
        LinkedList<Object> q = new LinkedList<>();
// Insert
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);


// Remove front
        q.remove();

        System.out.println(q);

// View front
        System.out.println(q.peek());

// Check empty
        System.out.println(q.isEmpty());

// Size
        System.out.println(q.size());

    }
}
