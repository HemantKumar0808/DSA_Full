package EasyQuesInteger_Array;

import java.util.*;

public class Count1{
    static int count1(int n) {
        //Write code here
        // int count = 0;
        // while(n > 0){
        //     if(n % 10 == 1){
        //         count++;
        //     }
        //     n /= 10;
        // }
        // return count;

        // recursion
        if (n == 0){
            return 0;
        }

        int rec = count1(n/10);
        if(n % 10 == 1){
            return 1 + rec;
        }else{
            return rec;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count1(n));
        sc.close();
    }


}

