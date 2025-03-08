import java.util.Scanner;

public class Func1 {
    static int factorial(int n) {
        int facCal = 1;
        for (int i = n; i >= 1; i--) {
            facCal = facCal * i;
        }
        return facCal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));


    }
}