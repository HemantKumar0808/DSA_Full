package EasyQuesInteger_Array;

import java.util.Scanner;

public class RecursiveSumNno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(print1(n));

    }
    public static int print1(int n){
        if(n == 0){
            return 0;
        }
        return n + print1(n-1);
    }


}
