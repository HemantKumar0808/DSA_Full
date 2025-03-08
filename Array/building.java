import java.util.*;

public class building {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        buildings(arr, n);
    }

    public static void buildings(int[] a, int n) {
        // your code here
        int mx = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            if(a[i] > mx) {
                mx = a[i];
            }
        }

        int p = mx;
        for(int i = 1; i <= mx; i++) {
            for(int j = 0; j < n; j++) {
                if(a[j] >= p) {
                    System.out.print("*   ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            p--;
        }
    }
}