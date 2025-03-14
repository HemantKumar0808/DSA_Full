import java.io.*;
import java.util.*;

class Solution{
    static boolean special(int matrix[][], int n){
        //Write code here
        if(n==0) return true;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    if(matrix[i][j]==0) return false;
                }
                else if(matrix[i][j]!=0) return false;
            }
        }
        return true;
    }
}
class Main{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++)
                    matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            boolean ans = ob.special(matrix, n);
            System.out.println(ans);
        }
    }
}