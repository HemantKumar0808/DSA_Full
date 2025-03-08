import java.util.Scanner;

public class func3prime {
    static void primechk(int n){
        int count = 0;
        for (int i = 2; i <= n-1; i++) {
            if(n % i == 0){
                count = count + 1;
            }
        }
        if (count > 0){
            System.out.println("not prime");
        }else {
            System.out.println("no. is prime");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        primechk(n);


    }
}
