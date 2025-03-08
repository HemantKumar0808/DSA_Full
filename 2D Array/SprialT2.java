import java.util.*;

public class SprialT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];//space complexity is O(1)
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        spiralTraversal(matrix);
        sc.close();
    }

    public static void spiralTraversal(int[][] matrix) {
        int rowNum=matrix.length;
        int colNum=matrix[0].length;
        int left=0;
        int right=colNum-1;
        int top=0;
        int bottom=rowNum-1;
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                System.out.print(matrix[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                System.out.print(matrix[i][right]+" ");
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
            }
            bottom--;
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
            }
            left++;
        }

    }
}