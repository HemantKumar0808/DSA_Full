import java.util.*;

public class spirallyTransversingMatrix {
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

        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = 0;
        int endrow = m - 1;
        int endcol = n - 1;
        while (col <= endcol && row <= endrow) {
//      1.  R --> L
//        row = Fixed 0 , col = change 0 --> n
            for (int j = col; j <= endcol; j++) {
                System.out.print(matrix[row][j] + " ");
            }
            row++;// 1

//        2. T --> B
//        row = change 1 --> m , col = fixed n-1
            for (int i = row; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            endcol--; // n-2

            //      3.  L --> R
//        row = Fixed endrow , col = change n-2 --> c0
            if(row <= endrow) {
                for (int j = endcol; j >= col; j--) {
                    System.out.print(matrix[endrow][j] + " ");
                }
            }
            endrow--; // m-2

//        4. B --> T
            if(col <= endcol) {
                for (int i = endrow; i >= row; i--) {
                    System.out.print(matrix[i][col] + " ");
                }
            }
            col++; // 1
        }


//        int rowNum=matrix.length;
//        int colNum=matrix[0].length;
//        int left=0;
//        int right=colNum-1;
//        int top=0;
//        int bottom=rowNum-1;
//        while(left<=right && top<=bottom)
//        {
//            for(int i=left;i<=right;i++)
//            {
//                System.out.print(matrix[top][i]+" ");
//            }
//            top++;
//            for(int i=top;i<=bottom;i++)
//            {
//                System.out.print(matrix[i][right]+" ");
//            }
//            right--;
////            if(top<=bottom) {
//                for (int i = right; i >= left; i--) {
//                    System.out.print(matrix[bottom][i] + " ");
//                }
////            }
//            bottom--;
////            if(left<=right) {
//                for (int i = bottom; i >= top; i--) {
//                    System.out.print(matrix[i][left] + " ");
//                }
////            }
//            left++;
//        }


    }
}
