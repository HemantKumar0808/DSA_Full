import java.util.*;

public class SumUpperLowerTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        triangleSums(n, matrix);
        sc.close();
    }

    public static void triangleSums(int n, int[][] matrix) {
        // your code here
        // for lower triangle
        int lowerSum = 0;
        for(int col = 0; col < n; col++){
            for(int row = col; row < n; row++){
                lowerSum = lowerSum + matrix[row][col];
            }
        }

        int upperSum = 0;
        // for (int row = 0;  row < n; row++){
        //     for(int col = row; col < n; col++){
        //         upperSum = upperSum + matrix[row][col];
        //     }
        // }
        for (int row = 0;  row < n; row++){
            for(int col = n-1; col >= row; col--){
                upperSum = upperSum + matrix[row][col];
            }
        }

        System.out.print(upperSum + " " + lowerSum);
    }
}
