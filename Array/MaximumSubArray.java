import java.util.*;

public class MaximumSubArray {

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();
        System.out.println(maxSubArraySum(arr,n));
    }

    // Function Call
    static int maxSubArraySum(int arr[], int n) {

//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            int current_sum = 0;
//            for(int j = i; j < n; j++){
//                current_sum = current_sum + arr[j];
////                if(current_sum > max){
////                    max = current_sum;
////                }
//                max = Math.max(current_sum,max);
//            }
//        }

//        Kedane's Algorithm
      int max = Integer.MIN_VALUE;

            int CS = 0;
            for(int i = 0; i<n; i++){
                CS = CS + arr[i];
                max = Math.max(CS, max);
                if(CS < 0){
                    CS = 0;
                }
            }

        return max;








//        // your code here
//        // Initialize current max and global max with the first element
//        int max_current = a[0];
//        int max_global = a[0];
//
//        // Traverse the array starting from the second element
//        for (int i = 1; i < a.length; i++) {
//            // Update the current max, either by starting fresh from a[i]
//            // or extending the previous subarray with a[i]
//            max_current = Math.max(a[i], max_current + a[i]);
//
//            // Update global max if the current max is larger
//            if (max_current > max_global) {
//                max_global = max_current;
//            }
//        }
//
//        // Return the maximum subarray sum
//        return max_global;
    }
}
