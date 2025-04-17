package AllMazeQues;

import java.io.*;
public class AMazePath {
    public static void aMazePaths(int n, int m, String psf,int i , int j){
        //Write your code here
        if(i == n || j == m){
            return;
        }
        if(i == n-1 && j == m-1){
            System.out.println(psf);
            return;
        }

//        taking right
        aMazePaths(n,m,psf + "R", i, j+1);

//        taking down
        aMazePaths(n,m,psf + "D", i+1, j);


    }

    public static void main(String[] args) throws Exception {

        int n = 3;
        int m = 3;
        int[][] maze = new int[n][m];
        aMazePaths(n, m, "",0,0);
    }
}
