import java.util.Scanner;

public class SecondLargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input elements of array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function to get the second largest element
        int secondLargest = findSecondLargest(n, arr);

        // Print the result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }

    public static int findSecondLargest(int n, int[] arr) {
        // Edge case: If array has less than 2 elements
//        if (n < 2) {
//            return Integer.MIN_VALUE;  // No second largest
//        }

        int firstLargest = 0;
        int secondLargest = -1;

        // Loop through the array
        for (int i = 0; i < n; i++) {
            if (arr[i] > firstLargest) {
                // Update both firstLargest and secondLargest
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                // Update secondLargest only if it's smaller than current element
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
