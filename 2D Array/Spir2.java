import java.io.*;
import java.util.*;

public class Spir2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                mat[i][j] = sc.nextInt();
            }
        }

        spirallyTraverse(mat);
        System.out.println();
    }

    public static void spirallyTraverse(int[][] mat) {
        int rowLast = mat.length;
        int colLast = mat[0].length;

        int left = 0;
        int right = colLast - 1;
        int top = 0;
        int bottom = rowLast - 1;

        while (left <= right && top <= bottom) {
            // Left to right (row fixed, column moves)
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;

            // Top to bottom (column fixed, row moves)
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;

            // Right to left (row fixed, column moves in reverse)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }

            // Bottom to top (column fixed, row moves in reverse)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }
}

