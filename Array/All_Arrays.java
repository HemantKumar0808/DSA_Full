

import java.util.Arrays;
import java.util.Scanner;

public class All_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         #################################  1D array  #####################################
//        First method
        int[] arr1 = new int[5]; // 0 ---> 4 index
        arr1[0] = 10;  // 0th index
        arr1[1] = 20;  // 1st index
        arr1[2] = 30;  // |
        arr1[3] = 40;  // |
        arr1[4] = 50;  // Last index 4th
//        arr[5] = 60;  // index out of bound

//        System.out.println(arr1[1]);

//        Second method
        int[] arr2 = {1,2,3,4,5}; // initialized value
//        int[] arr2 = new int[5];

////         Input from User
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = sc.nextInt();
//        }
//
////        Output
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.println();
//
////         Enhanced loop OR for each loop
//        for(int num: arr2){
//            System.out.print(num+" ");
//        }
//        Print array with Method
//        System.out.println(Arrays.toString(arr2));


//        #####################################  2D Array  ####################################
//        int arr3[][] = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        int arr3[][] =  new int[3][2];
//        Taking input
        for (int row = 0; row < arr3.length; row++) { // arr3.length ---> go till arr3 of row
            for (int col = 0; col < arr3[row].length; col++) { // arr3.length ---> go till arr3 of col
                arr3[row][col] = sc.nextInt();
            }
//            no need next line
        }

//        giving output
        for (int row = 0; row < arr3.length; row++) { // arr3.length ---> go till arr3 of row
            for (int col = 0; col < arr3[row].length; col++) { // arr3.length ---> go till arr3 of col
                System.out.print(arr3[row][col] + " ");
            }
            System.out.println();
        }

////         Enhanced loop OR for each loop
//        for(int num: arr2){
//            System.out.print(num+" ");
//        }
//        Print array with Method
//        System.out.println(Arrays.toString(arr2));

//        Method Printing
//        for (int row = 0; row < arr3.length; row++){
//            System.out.println(Arrays.toString(arr3[row]));
//        }
////        Enhanced For Each Loop
//        for(int[] num : arr3){
//            System.out.println(Arrays.toString(num));
//        }






    }
}
