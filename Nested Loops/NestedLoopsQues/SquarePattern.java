import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //  1 2 3 4
        //  1 2 3 4
        //  1 2 3 4
        //  1 2 3 4

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println();

        //  1 2 3
        //  4 5 6
        //  7 8 9
        int num = 1;

        for (int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++){
                System.out.print(num + " ");
                num = num + 1;
            }

            System.out.println();
        }

        System.out.println();

        //  A B C D
        //  A B C D
        //  A B C D
        //  A B C D

        for (int i = 0; i < n; i++) {

            char ch = 'A';
            for(int j = 0; j < n; j++){
                System.out.print(ch + " ");
                ch++; // 'A' --> 65 + 1 = 66
            }

            System.out.println();
        }

            System.out.println();

        //  A B C D
        //  E F G H
        //  I J K L
        //  M N O P

            char ch = 'A';
        for (int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++){
                System.out.print(ch + " ");
                ch++; // 'A' --> 65 + 1 = 66
            }

            System.out.println();
        }
    }
}
