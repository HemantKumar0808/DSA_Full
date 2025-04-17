package HashMap.PreFixSuFixSum;

import java.util.HashMap;

public class SubArraySumEqualsToK{
    public static void main(String[] args) {
        int arr[] = {3, 4, 7, 2, -3, 1, 4, 2};
        int k = 7;
        System.out.println(countSubarrays(arr, k)); // Output: 4
    }

    static int countSubarrays(int[] arr, int k) {

        int n = arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
         prefixSum = prefixSum + arr[i];

         int complement = prefixSum-k;
         if(map.containsKey(complement)){
             count = count + map.get(complement);
         }

         map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }

        return count;
    }
}
