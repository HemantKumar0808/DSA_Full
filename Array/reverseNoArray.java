import java.util.Arrays;
import java.util.Scanner;

public class reverseNoArray {

    public static void rotateArray(int[] nums, int k) {
        // write your code here
        int n=nums.length;

        for( int i=1; i<=k;i++){
            // rotate wala code
            for(int j=n-1; j>0;j--){
                int firstElement = nums[j];
                int secondElement=nums[j-1];
                int temp = secondElement;
                secondElement=firstElement;
                firstElement=temp;
                nums[j]=firstElement;
                nums[j-1]=secondElement;

            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        rotateArray(arr, k);

        for(int num : arr){
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
