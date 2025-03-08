import java.util.Scanner;

public class PrintNthPrime {

        static void primechk(int n){

//         1st method

//         Edge Case
        if(n < 2){
            System.out.print("not prime");
            return;
        }
        int count = 0;
        for (int i = 2; i <= n ; i++) {
            if(n % i == 0){
                count++;
            }
        }
        if(count > 1){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
}
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                primechk(n);
        }
}
