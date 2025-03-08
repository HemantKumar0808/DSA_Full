import java.util.Arrays;

public class Multidimensional {
    public static void main(String[] args) {
        int arr3[][] = {
                {1,2,3},
                {4,5,6}, // arr3[1] = {4,5,6}
                {7,8,9}
        };

        System.out.println(arr3[0][2]);// arr3 --> row=[0] col[2]
//        for find length of row 1
        System.out.println(arr3[1].length);// arr3 --> row=[1].length = 3  <-- {4,5,6}

//        ##############################  Multi Dimensional Array
        int[][] MDA =  {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        int[][] Mda = new int[3][];
//        Output
        for(int row = 0; row < MDA.length; row++){ // MDA.length = last no. of row
            for(int col = 0; col < MDA[row].length; col++){ // MDA[0].length = MDA[0] 0 ki length = 3
                System.out.print(MDA[row][col]);    // MDA[1].length = MDA[2] 2 ki length = 2
            }                                         // MDA[2].length = MDA[2] 2 ki length = 4
            System.out.println();
        }

//        Print with help of Method
        for (int row = 0; row < MDA.length; row++) {
            System.out.println(Arrays.toString(MDA[row]));
        }
//        Enhanced Each Loop
        for (int[] num: MDA){
            System.out.println(Arrays.toString(num)); // MDA[0] = {1,2,3} then MDA[2] & last MDA[3]
        }

    }
}
