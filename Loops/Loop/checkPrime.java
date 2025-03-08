import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
//        method 1st
//        issue it shows 1 is not prime no.
        int count = 0;
        for (int i = 1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println(n +" is a prime no.");
        }else {
            System.out.println(n +" is not a prime no.");
        }


//        method 2nd
        int temp = 0;
        for (int i = 2; i <=n-1; i++){ //or i<n
            if(n % i == 0){
                temp = temp + 1;
            }
        }
        if (temp>0){
            System.out.println(n +" is not a prime no.");
        }else {
            System.out.println(n +" is a prime no.");
        }
//      method 3rd
        int tem = 0;
        for (int i = 2; i <= n; i++){
            if(n % i == 0){
                tem = tem + 1;
            }
        }
        if (tem > 1){
            System.out.println(n +" is not a prime no.");
        }else {
            System.out.println(n +" is a prime no.");
        }

    }

//    method 4th
// Java Program to demonstrate
// Brute Force Method
// to check if a number is prime
//class GFG {
//    static boolean isPrime(int n)
//    {
//// Corner case
//        if (n <= 1)
//            return false;
//// Check from 2 to n-1
//        for (int i = 2; i < n; i++)
//            if (n % i == 0)
//                return false;
//        return true;
}
