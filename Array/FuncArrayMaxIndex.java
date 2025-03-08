import java.util.*;

public class FuncArrayMaxIndex {
    public static int ArrayProblem1(int n, int[] arr){
        // Write code here
//        // Edge case: if the array is empty
//        if (n == 0) {
//            return -1;  // Returning -1 as there's no valid index
//        }

        int max = arr[0];      // Initialize max as the first element
        int maxIndex = 0;      // Initialize maxIndex as 0 (first element)

        // Traverse the array to find the maximum value and its index
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];   // Update max to the new largest value
                maxIndex = i;   // Update maxIndex to the current index
            }
        }
        return maxIndex;  // Return the index of the largest element
    }


    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

//        input
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem1(n,arr);
        System.out.println(ans);
    }
}
