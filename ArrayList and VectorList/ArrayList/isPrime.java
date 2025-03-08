package ArrayList;

import java.util.*;

class isPrime
{

    static ArrayList<Integer> removeComposite(int arr[], int len)
    {
        ArrayList<Integer> result = new ArrayList<>();

        // Iterate through the array
        for (int i = 0; i < len; i++) {
            // Check if the number is prime
            if (isPrimeOrNot(arr[i])) {
                result.add(arr[i]);
            }

        }

        return result; // Return the updated list
    }

    // Helper function to check if a number is prime
    static boolean isPrimeOrNot(int num) {
        if (num <= 1) return false;  // 1 and numbers <= 1 are not prime
        if (num == 2) return true;   // 2 is prime
        if (num % 2 == 0) return false; // Eliminate even numbers > 2
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = removeComposite(arr, n);
        for(int val : list) System.out.print(val+" ");

    }
}
