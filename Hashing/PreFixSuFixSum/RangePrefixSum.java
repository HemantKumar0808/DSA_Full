package HashMap.PreFixSuFixSum;

import java.util.Scanner;

public class RangePrefixSum {
    public static int[] solve(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }

        return arr;
    }
    public static int findRangeSum(int[] prefixSum, int left, int right) {
        int ans = prefixSum[right] - prefixSum[left-1];
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i < n+1; i++){
            arr[i] = sc.nextInt();
        }
        int[] prefixSum = solve(arr);
        for(int i = 1; i < prefixSum.length; i++){
            System.out.print(prefixSum[i]+" ");
        }

        System.out.println();

        int left = sc.nextInt();
        int right = sc.nextInt();
        int range = findRangeSum(prefixSum,left,right);
        System.out.println(range);
    }


}
