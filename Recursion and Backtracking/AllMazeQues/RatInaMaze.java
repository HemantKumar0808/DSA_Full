package AllMazeQues;

import java.io.*;
public class RatInaMaze {
    public static void aMazePaths(int sr , int sc, int er, int ec, String psf, boolean[][] isVisited){
        //Write your code here

        if (sr>er || sc>ec || sr<0 || sc<0){
            return;
        }

        if(isVisited[sr][sc] == true){ // V IMP
            return;
        }

        if (sr==er && sc==ec){
            System.out.println(psf);
            return;
        }

        isVisited[sr][sc] = true;

        //taking right option
        aMazePaths(sr, sc+1, er, ec, psf + "R", isVisited);

        //taking down option
        aMazePaths(sr+1, sc, er, ec, psf + "D", isVisited );

        //taking left option
        aMazePaths(sr, sc-1, er, ec, psf + "L", isVisited );

        //taking up option
        aMazePaths(sr-1, sc, er, ec, psf + "U", isVisited );

        isVisited[sr][sc] = false; // V IMP

    }

    public static void main(String[] args) throws Exception {
        int n = 3;
        int m = 3;
        boolean[][] isVisited = new boolean[n][m];
        aMazePaths(0,0,n-1, m-1, "",isVisited);
    }
}
