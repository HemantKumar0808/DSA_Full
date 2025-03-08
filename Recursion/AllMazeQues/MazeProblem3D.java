package AllMazeQues;

public class MazeProblem3D {
    public static void printMazePaths(int sr, int sc, int er, int ec, String psf) {
        //Write your code here

//        if(sr>er || sc>ec)return;
//
//        if(sr == er && sc == ec){
//            System.out.println(psf);
//            return;
//        }
//
//        printMazePaths(sr, sc+1, er, ec, psf+"h1");
//        printMazePaths(sr+1, sc, er, ec, psf+"v1");
//        printMazePaths(sr+1, sc+1, er, ec, psf+"d1");

//        if (sr == er && sc == ec) {
//            System.out.println(psf);
//            return;
//        }
//
//        // Horizontal jumps
//        for (int jump = 1; sc + jump <= ec; jump++) {
//            printMazePaths(sr, sc + jump, er, ec, psf + "h" + jump);
//        }
//
//        // Vertical jumps
//        for (int jump = 1; sr + jump <= er; jump++) {
//            printMazePaths(sr + jump, sc, er, ec, psf + "v" + jump);
//        }
//
//        // Diagonal jumps
//        for (int jump = 1; sr + jump <= er && sc + jump <= ec; jump++) {
//            printMazePaths(sr + jump, sc + jump, er, ec, psf + "d" + jump);
//        }


        if(sr == er && sc == ec){
            System.out.println(psf);
            return;
        }

        // Horizontal moves
        for(int ms = 1; ms <= ec - sc; ms++){
            printMazePaths(sr, sc + ms, er, ec, psf + "h" + ms);
        }

        // Vertical moves
        for(int ms = 1; ms <= er - sr; ms++){
            printMazePaths(sr + ms, sc, er, ec, psf + "v" + ms);
        }

        // Diagonal moves
        for(int ms = 1; ms <= er - sr && ms <= ec - sc; ms++){
            printMazePaths(sr + ms, sc + ms, er, ec, psf + "d" + ms);
        }




    }
    public static void main(String[] args) throws Exception {
        int n = 3;
        int m = 3;
        printMazePaths(0, 0, n - 1, m - 1, "");
    }
}
