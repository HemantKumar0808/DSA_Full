import java.util.Scanner;
import java.io.*;

public class DiamondPattern{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //write code here
        // upper half
        for(int row = 1; row <= n; row++)
        {
            for( int space = row; space < n; space++){
                System.out.print("  ");
            }
            for(int col = 1; col<=row; col++)
            {
                System.out.print("* ");
            }
            for( int remain = 2; remain <=row; remain++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half
        for(int row = 2; row <= n; row++)
        {
            for( int space = 1; space < row; space++){
                System.out.print("  ");
            }
            for(int col = row; col <= n; col++)
            {
                System.out.print("* ");
            }
            for( int remain = row; remain <=n-1; remain++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd method
        // Input the number of rows for half of the diamond

                // Upper half of the diamond
                for (int row = 1; row <= n; row++) {
                    // Print leading spaces
                    for (int space = row; space < n; space++) {
                        System.out.print("  ");
                    }
                    // Print increasing stars
                    for (int col = 1; col <= (2 * row - 1); col++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

                // Lower half of the diamond
                for (int row = n - 1; row >= 1; row--) {
                    // Print leading spaces
                    for (int space = n; space > row; space--) {
                        System.out.print("  ");
                    }
                    // Print decreasing stars
                    for (int col = 1; col <= (2 * row - 1); col++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        }
