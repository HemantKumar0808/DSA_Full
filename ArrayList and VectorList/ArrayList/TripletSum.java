package ArrayList;

import java.util.*;

public class TripletSum {
    public static int triplets(ArrayList<Integer> arr, int X) {
        // your code here
        // ArrayList<Integer> newList = new ArrayList<>();
        // Manual check for duplicates using a for loop
        // for (int i = 0; i < arr.size(); i++) {
        //     Integer item = arr.get(i); // Get the current element
        //     if (!newList.contains(item)) { // Check if newList does not already contain it
        //         newList.add(item); // Add only unique elements
        //     }
        // }


        // int n = newList.size();
        // int count = 0;
        // for(int i = 0; i < n - 2; i++){
        //     for(int j = i + 1; j < n-1; j++){
        //         for(int k = j + 1; k < n; k++){
        //            int sum = newList.get(i)+ newList.get(j) + newList.get(k);
        //            if(sum == X){
        //             count++;
        //            }
        //         }
        //     }
        // }
        // return count;
        int n = arr.size();
        int count = 0;
        for(int i = 0; i < n-2; i++){
            int j = i+1;
            int k = n-1;
            while(k > j){
                int sum = arr.get(i) + arr.get(j) + arr.get(k);
                if(sum == X){
                    count++;
                }
                k--;
            }
        }
        return count;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t > 0) {
            int n, X;
            n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>(n);
            for (int i = 0; i < n; i++) arr.add(sc.nextInt());
            X = sc.nextInt();
            int result = triplets(arr, X);
            System.out.println(result);
            t--;
        }
        sc.close();
    }


}
