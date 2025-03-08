package EasyQuesInteger_Array;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X,N;
        X = sc.nextInt();
        N = sc.nextInt();

        System.out.println(power(X,N));
    }

    public static long power(int x, int y)
    {
        //Write code here
         if(y == 0){
             return 1;
         }
         if(y == 1){
             return x;
         }
         long ans;
         if(y % 2 == 0){
             ans = power(x, y / 2)* power(x, y / 2);
         }else{
             ans = x * power(x, y / 2)* power(x, y / 2);
         }
         return ans;

//        if(y == 0){
//            return 1;
//        }
//        if(y == 1){
//            return x;
//        }
//        long store = power(x, y / 2);
//        if(y % 2 == 0){
//            return store * store;
//        }else{
//            return x * store * store;
//        }
    }
}
