import java.util.Scanner;

public class pelidromeChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int reversed = 0;
        while(n > 0){
            int digit = n % 10;
            n = n /10;
            reversed = reversed*10+digit;
        }
        if(reversed == original){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
