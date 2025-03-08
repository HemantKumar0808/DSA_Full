import java.util.Arrays;
import java.util.Scanner;

public class TwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Unsorted Array :");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted Array :");
        fun(arr,n);
    }

    public static void fun(int[] arr, int n) {
        int left = 0;
        int right = n-1;
        while (right >= left){
            if(arr[left] == 1 && arr[right] == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
                left++;
                right--;

            }

        System.out.println(Arrays.toString(arr));

    }
}
