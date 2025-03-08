package FunctionPracticeQues;

import java.util.*;

public class calculatenCr {

    static long calculate_nCr(int n, int r) {
        // write code here
        long ufac = 1;
        for(long i = n; i>=1; i--){
            ufac = ufac * i;
        }
        long lfacr = 1;
        for(long i = r; i>=1; i--){
            lfacr = lfacr * i;
        }
        long lfacnr =1;
        for(long i = n-r; i>=1; i--){
            lfacnr = lfacnr * i;
        }
        long lfac =  lfacr * lfacnr;

        long result = ufac / lfac;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        long ans = calculate_nCr(n,r);
        System.out.print(ans);
    }
}