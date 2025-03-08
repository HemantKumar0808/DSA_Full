package EasyQuesInteger_Array;

import java.util.*;
public class multipleRecursive {
    public static int multiplyRecursively(int n, int m) {
        //Write code here and print output
        if(m == 0){
            return 0;
        }

        int store = multiplyRecursively(n,m-1);

        int result = n + store;
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int finalResult = multiplyRecursively(n, m);
        System.out.print(finalResult);
    }
}
