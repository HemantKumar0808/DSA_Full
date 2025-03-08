package EasyQuesInteger_Array;

import java.util.*;


public class PrintArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        PrintArray(arr, n);
    }

    // public static void PrintArray(int[] arr, int n) {
    //   // Write your code here
    //   helper(arr, 0 , n);
    // }
    // public static void helper(int [] arr, int idx, int n){
    //     if(idx == n){
    //         return;
    //     }
    //     System.out.print(arr[idx] + " ");
    //     helper(arr, idx + 1, n);
    // }
    public static void PrintArray(int[] arr, int n) {
        // Write your code here
        if(n <= 0){
            return;
        }

        PrintArray(arr, n-1);
        System.out.print(arr[n-1] + " ");

    }

}
