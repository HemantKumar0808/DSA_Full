import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();  // Use nextLong() for long input

        long fac = 1;

        for(long i = 1; i <= n; i++){
            fac = fac * i;
        }

        System.out.println(fac);
    }
}

