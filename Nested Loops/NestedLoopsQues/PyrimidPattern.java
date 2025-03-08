import java.util.Scanner;

public class PyrimidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //   _ _ _ _ 1
        //   _ _ _ 1 2 1
        //   _ _ 1 2 3 2 1
        //   _ 1 2 3 4 3 2 1
        //   1 2 3 4 5 4 3 2 1

        for (int i = 1; i <= n ; i++) {

            for (int j = n-1; j >= i; j--){
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }

            for (int j = i-1; j >= 1; j--){
                System.out.print(j+" ");
            }

            System.out.println();
        }

    }
}
