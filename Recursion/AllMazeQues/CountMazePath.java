package AllMazeQues;

import java.util.*;

public class CountMazePath{
    static int helper(int n, int m, int i, int j){
        if (i == n && j == m) return 1;

        // Base Case - बाहर चले गए
        if (i > n || j > m) return 0;

        // Recursive Case - right और down moves
        int right = helper(n, m, i, j + 1);
        int down = helper(n, m, i + 1, j);

        return right + down;
    }


    static int countMazePath(int n, int m)
    {
        return helper(n, m, 1, 1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n;
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println(countMazePath(n, m));
    }
}
