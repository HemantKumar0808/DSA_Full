package HashMap.PreFixSuFixSum;

import java.util.Scanner;

public class TwoSubArrayWithEqualSum {

    private static int[] prefixSumFun(int[] arr) {

        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }


    private static int findTotalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] =  sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();


        int totalSum = findTotalSum(arr);

        int prefixSum[] = prefixSumFun(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(prefixSum[i] + " ");
        }

        System.out.println();

        int ans = sol(arr, totalSum);
        System.out.println(ans);


    }

    private static int sol(int[] prefixSum, int totalSum) {
        for(int i = 0; i < prefixSum.length; i++){
            int suffix = totalSum - prefixSum[i];

            if(prefixSum[i] == suffix){
                return i;
            }
        }

        return -1;
    }


}
