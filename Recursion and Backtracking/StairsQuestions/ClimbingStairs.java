package StairsQuestions;

import java.util.Arrays;

public class ClimbingStairs {

    public static void main(String[] args) {
        ClimbingStairs sol = new ClimbingStairs();  // Yeh change karna hai
        int n = 4;  // yaha value change karke kisi bhi "n" ka dry run kar sakta hai
        int ans = sol.climbStairs(n);
        System.out.println("Ways to climb " + n + " stairs = " + ans);
    }

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];   // Step 1: Create a dp array
        Arrays.fill(dp, -1);         // Step 2: Fill it with -1 initially
        return helper(n, dp);         // Step 3: Call helper
    }

    private int helper(int n, int[] dp) {
        if (n == 0) return 1;        // Base Case 1: No stairs left
        if (n < 0) return 0;         // Base Case 2: Negative stairs (invalid)

        if (dp[n] != -1) {
            return dp[n];            // If already calculated, return stored result
        }

        // Recurrence Relation
        dp[n] = helper(n - 1, dp) + helper(n - 2, dp);

        return dp[n];
    }
}


