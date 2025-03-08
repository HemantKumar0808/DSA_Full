import java.util.*;

public class SumofArrayExceptSelf {

    public static int[] sumArrayExpectSelf(int[] nums, int n) {
        //Write code here
        int totalSumArray = 0;
        for(int i = 0; i < n; i++){
            totalSumArray =+ nums[i];
        }

        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            result[i] = totalSumArray - nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] Ans = sumArrayExpectSelf(nums, n);

        for(int a : Ans)
            System.out.print(a + " ");
    }
}
