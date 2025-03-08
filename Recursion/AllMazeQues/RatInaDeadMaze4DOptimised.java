package AllMazeQues;

public class RatInaDeadMaze4DOptimised {
    public static void aMazePaths(int sr , int sc, int er, int ec, String psf, int[][] maze){
        //Write your code here

        if (sr>er || sc>ec || sr<0 || sc<0){
            return;
        }

        if(maze[sr][sc] == 0){
            return;
        }

        if(maze[sr][sc]== -1){  // V Imp
            return;
        }

        if (sr==er && sc==ec){
            System.out.println(psf);
            return;
        }

        maze[sr][sc] = -1;

        //taking right option
        aMazePaths(sr, sc+1, er, ec, psf + "R", maze);

        //taking down option
        aMazePaths(sr+1, sc, er, ec, psf + "D", maze);

        //taking left option
        aMazePaths(sr, sc-1, er, ec, psf + "L", maze);

        //taking up option
        aMazePaths(sr-1, sc, er, ec, psf + "U", maze);

        maze[sr][sc] = 1; // V Imp
    }

    public static void main(String[] args) throws Exception {
        String str = "";
        int rows = 3;
        int cols = 4;

        int[][] maze = {{1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}};
//        boolean[][] isVisited = new boolean[rows][cols];
        aMazePaths(0,0,rows-1, cols-1, "", maze);
    }
}
