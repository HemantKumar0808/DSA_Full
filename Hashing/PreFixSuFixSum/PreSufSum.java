package HashMap.PreFixSuFixSum;

import java.util.Scanner;

public class PreSufSum {
    private static int[] prefixSumFun(int[] arr) {

        int[] pref = new int[arr.length];
        pref[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;

//        for(int i = 1; i < arr.length; i++){
//            arr[i] = arr[i-1] + arr[i];
//        }
//        return arr;
    }
    private static int[] suffixSumFun(int[] arr) {
        int[] suff = new int[arr.length];
        suff[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2; i >= 0; i--){
            suff[i] = suff[i+1] + arr[i];
        }
        return suff;
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


        int prefixSum[] = prefixSumFun(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(prefixSum[i] + " ");
        }

        System.out.println();


        int suffixSum[] = suffixSumFun(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(suffixSum[i] + " ");
        }
}
}
