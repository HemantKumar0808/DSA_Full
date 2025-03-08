import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // Size of the array
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();  // Target element to search for
        Solution ob = new Solution();
        System.out.println(ob.search(A, B));
    }
}

class Solution {
    public int search(final int[] a, int target) {
        int n = a.length;
        int si = 0, ei = n - 1;
        int ans = -1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            // Check if we found the target
            if (a[mid] == target) {
                return mid;
            }

            // Determine which half is sorted
            if (a[si] <= a[mid]) {  // Left half is sorted
                if (a[si] <= target && target < a[mid]) {
                    ei = mid - 1;  // Target is in the left half
                } else {
                    si = mid + 1;  // Target is in the right half
                }
            } else {  // Right half is sorted
                if (a[mid] < target && target <= a[ei]) {
                    si = mid + 1;  // Target is in the right half
                } else {
                    ei = mid - 1;  // Target is in the left half
                }
            }
        }

        return -1;  // If target is not found
    }
}

