package ArrayList;

import java.sql.Array;
import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<Integer> list1D = new ArrayList<>(); // Default/Initial Capacity is 10.
        list1D.add(10);
        list1D.add(20);
        list1D.add(30);
        list1D.add(40);
        list1D.add(50);

        // add(index, 200)
        // get
        // set
        // remove
        System.out.println(list1D);

        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();
        for(int i  = 0; i < 4 ; i++) {
            list2D.add(new ArrayList<>());
        }

        // 4x4
//        Add in 2D ArrayList
        list2D.get(0).add(11);
        list2D.get(0).add(12);
        list2D.get(0).add(13);
        list2D.get(0).add(14);

        list2D.get(1).add(21);
        list2D.get(1).add(22);
        list2D.get(1).add(23);
        list2D.get(1).add(24);

        list2D.get(2).add(31);
        list2D.get(2).add(32);
        list2D.get(2).add(33);
        list2D.get(2).add(34);

        list2D.get(3).add(41);
        list2D.get(3).add(42);
        list2D.get(3).add(43);
        list2D.get(3).add(44);

        // Print 2D ArrayList
        for (int i = 0; i < list2D.size(); i++) {
            for (int j = 0; j < list2D.get(i).size(); j++) {
                System.out.print(list2D.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println();

//        Set in 2D ArrayList
        list2D.get(1).set(1,25);

//        Add in 2D Arraylist
        list2D.get(1).add(2,26);

        // Print 2D ArrayList
        for (int i = 0; i < list2D.size(); i++) {
            for (int j = 0; j < list2D.get(i).size(); j++) {
                System.out.print(list2D.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println();

        // add(index, 200)
        // get
        // set
        // contains
        // remove
        list2D.get(1).remove(2);

        // remove entire row
        list2D.remove(2);

        // Find Size of Rows and Columns
        System.out.println("Rows: " + list2D.size());
        System.out.println("Columns in Row 0: " + list2D.get(0).size());
        System.out.println("Columns in Row 0: " + list2D.get(0).size());

    }
}
