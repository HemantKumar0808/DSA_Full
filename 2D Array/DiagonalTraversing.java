import java.util.*;

public class DiagonalTraversing {
    public static void diagonalTraversal(int[][] mat, int n) {
        // upper triangle

        for (int startcol = n-1; startcol >= 0 ; startcol--) {
            int row = 0;
            int col = startcol;
            while(row < n && col < n){
                System.out.print(mat[row][col] + " ");
                col++;
                row++;
            }
        }
        // lower triangle
        for(int startrow = 1; startrow < n; startrow++){
            int row = startrow;
            int col = 0;
            while(row < n && col < n){
                System.out.print(mat[row][col] + " ");
                col++;
                row++;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        diagonalTraversal(mat, n);
    }
}
