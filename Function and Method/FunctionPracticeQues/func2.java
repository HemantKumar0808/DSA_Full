import java.util.Scanner;

public class func2 {
    public static void factorial(int n) { // factorial function
        //loop
        if(n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int result = 1;


        for(int i=n; i>=1; i--) {
            result = result * i;
        }


        System.out.println(result);
        return;
    }

    public static void main(String[] args) {
//        factorial in function
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factorial(n);

    }
}
