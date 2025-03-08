import java.util.Scanner;

public class solidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        1. Solid Rectangle
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
            System.out.println();

//        2. right top
        for (int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

//      3. right bottom
        for (int i = 0; i < n; i++) {
            for(int j = i; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

//        4.  left top
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int k = n - i - 1; k > 0; k--) {
                System.out.print("  ");
            }
            // Print stars with spaces in between
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }

//        5. left bottom



    }
}
