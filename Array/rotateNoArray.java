import java.util.Scanner;

public class rotateNoArray {
    static void reverse ( int arr[], int start, int end){

//        int start = 0;
//        int end = n-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =temp;
            start++;
            end--;
        }
    }
    static void rotateArray (int arr[], int k){
//        Normalize K (in case K is larger than the size of the array)
        k = k % arr.length;

//        If K is negative, we treat it as a left rotation
        if(k < 0){
            k= k + arr.length;
        }


        // step 1. reverse whole array
        reverse(arr,0, arr.length-1);

        // step 2. Reverse the first K elements
        reverse(arr,0,k-1);

        // step 3. Reverse the remaining N - K elements
        reverse(arr,k, arr.length-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        rotateArray(arr,k);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
//    // Helper function to reverse a portion of the array
//    public static void reverse(int[] nums, int start, int end) {
//        while (start < end) {
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//            start++;
//            end--;
//        }
//    }
//
//    public static void rotateArray(int[] nums, int k) {
//        int n = nums.length;
//
//        // Normalize K (in case K is larger than the size of the array)
//        k = k % n;
//
//        // If K is negative, we treat it as a left rotation
//        if (k < 0) {
//            k = n + k;  // Convert it to the equivalent right rotation
//        }
//
//        // Step 1: Reverse the whole array
//        reverse(nums, 0, n - 1);
//
//        // Step 2: Reverse the first K elements
//        reverse(nums, 0, k - 1);
//
//        // Step 3: Reverse the remaining N - K elements
//        reverse(nums, k, n - 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        int k = scanner.nextInt();
//
//        rotateArray(arr, k);
//
//        // Print the rotated array
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//
//        scanner.close();
