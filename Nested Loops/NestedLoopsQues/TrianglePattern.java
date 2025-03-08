import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        //  1
        //  1 2
        //  1 2 3
        //  1 2 3 4

        for (int i = 0; i <= n; i++) {

            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }


        //  1
        //  2 2
        //  3 3 3
        //  4 4 4 4

        for (int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }

            System.out.println();
        }


        //  1
        //  2 3
        //  4 5 6
        //  7 8 9 10

        int num = 1;
        for (int i = 0; i <= n; i++) {

            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }


        //  1
        //  2 1
        //  3 2 1
        //  4 3 2 1


        for (int i = 1; i <= n; i++) {

            int nums = i;
            for(int j = 1; j <= i; j++){
                System.out.print(nums + " ");
                nums--;
            }

            System.out.println();
        }


        //  1
        //  2 3
        //  3 4 5
        //  4 5 6 7

        for (int i = 0; i <= n; i++) {
        int nuumm = i;

            for(int j = 1; j <= i; j++){
                System.out.print(nuumm + " ");
                nuumm++;
            }

            System.out.println();
        }


        //  A
        //  A B
        //  A B C
        //  A B C D


        for (int i = 0; i <= n; i++) {

            char ch = 'A';
            for(int j = 1; j <= i; j++){
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }


        //  A
        //  B C
        //  D E F
        //  G H I J


            char ch = 'A';
        for (int i = 0; i <= n; i++) {

            for(int j = 1; j <= i; j++){
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }


        //  A
        //  B A
        //  C B A
        //  D C B A


        for (int i = 0; i < n; i++) {
            char chA = (char)('A' + i);

            for(int j = 0; j <= i; j++){
                System.out.print(chA + " ");
                chA--;

            }

            System.out.println();
        }

    }
}
