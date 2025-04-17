package HashMap.PreFixSuFixSum;

public class PrefixSumNoReturn {
    public static int[] solve(int[] arr) {

        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] prefixSum = solve(arr);
        for(int i = 0; i < prefixSum.length; i++){
            System.out.print(prefixSum[i]+" ");
        }
    }
}
