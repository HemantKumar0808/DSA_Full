import java.util.Scanner;

public class Transversematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][]matrix = new int[m][n];

//        loop for taking input from user
//        for row
        for(int row = 0; row < m; row++){
//            for column
            for(int col = 0; col < n; col++){
                matrix[row][col]= sc.nextInt();
            }
        }
//        loop for output
        for(int row = 0; row < m; row++){
//            for column
            for(int col = 0; col < n; col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }

//      first :  right --> left
//        row = stable 0, col = change 0 --> n-1
        for(int col = 0; col < n; col++){
            System.out.print(matrix[0][col]+" ");
        }

//        second : top --> bottom
//        row = change 1 --> m-1, col = stable n-1
        for(int row = 1; row < m; row++){
            System.out.print(matrix[row][n-1]+" ");
        }

//        third : right --> left
//        row = stable m-1, col = change n-2 --> 0
        if (m != 1){
        for(int col = n-2; col >= 0; col--){
            System.out.print(matrix[m-1][col]+" ");
            }
        }

//        fourth : bottom --> top
//        row = m-2 --> 1, col = 0
        if(n != 1) {
            for (int row = m - 2; row >= 1; row--) {
                System.out.print(matrix[row][0] + " ");
            }
        }
    }
}
