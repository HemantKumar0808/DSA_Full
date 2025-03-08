package AllMazeQues;

public class RatInaDeadMaze2D {
    public static void aMazePaths(int sr, int sc, int er , int ec,String str, int[][] maze){
        //Write your code here
        if (sr>er || sc>ec){
            return;
        }

        if(maze[sr][sc]==0){
            return;
        }

        if (sr==er && sc==ec){
            System.out.println(str);
            return;
        }

        //taking right option
        aMazePaths(sr, sc+1, er, ec, str + "R", maze);

        //taking down option
        aMazePaths(sr+1, sc, er, ec, str + "D", maze);
    }

    public static void main(String[] args) throws Exception {

        String str = "";
        int rows = 3;
        int cols = 3;

        int[][] maze = {{1,0,1},
                        {1,1,1},
                        {0,1,1}};
        aMazePaths(0,0, rows-1,cols-1, str, maze);
    }
}
