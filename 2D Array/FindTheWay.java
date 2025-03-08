import java.util.*;

public class FindTheWay {
    public static int[] findTheWay(int[][] a) {
        //Write code here
        int n = a.length;
        int m = a[0].length;

        int dir = 0; // 0 -> W-E, 1 -> N-S, 2 -> E-W, 3 -> S->N

        int row = 0, col = 0;

        int res[] = new int[2];//2 size of array(row,col)

        while(row >= 0 && row < n && col >= 0 && col < m) {
            res[0] = row;
            res[1] = col;
            if(a[row][col] == 0) {
                if(dir == 0) {
                    col = col + 1;
                }
                else if(dir == 1) {
                    row = row + 1;
                }
                else if(dir == 2) {
                    col = col - 1;
                }
                else {
                    row = row - 1;
                }
            }
            else {
                a[row][col]=0;//handling infinite loop
                if(dir == 0) {
                    dir = 1;
                    row = row + 1;
                }
                else if(dir == 1) {
                    dir = 2;
                    col = col - 1;
                }
                else if(dir == 2) {
                    dir = 3;
                    row = row - 1;
                }
                else {
                    dir = 0;
                    col = col + 1;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        }
        int result[] = findTheWay(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
