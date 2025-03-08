import java.util.*;
public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //  1 1 1 1
        //  _ 2 2 2
        //  _ _ 3 3
        //  _ _ _ 4

        for (int i = 1; i <= n; i++){

            for (int k =2; k <= i; k++){
                System.out.print("  ");
            }

            for(int j = n; j >= i; j--){
                System.out.print(i+" ");
            }

            System.out.println();
        }

        //  A A A A
        //  _ B B B
        //  _ _ C C
        //  _ _ _ D

            char ch = 'A';
        for (int i = 1; i <= n; i++){

            for (int k =2; k <= i; k++){
                System.out.print("  ");
            }

            for(int j = n; j >= i; j--){
                System.out.print(ch+" ");
            }
            ch++;

            System.out.println();
        }


        //  1 2 3 4
        //  1 2 3
        //  1 2
        //  1

        for (int i = n; i >=1 ; i--) {
            for(int j = n-1; j >= i; j--){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print(j + "");
            }

            System.out.println();
        }
    }
}
