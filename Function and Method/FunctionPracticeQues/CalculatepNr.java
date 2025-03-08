package FunctionPracticeQues;

import java.util.*;

public class CalculatepNr{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int dn = getValueInBase(n, r);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int r){
        // Your code here
        int ufacCal = 1;
        for(int i = n; i >= 1; i--){
            ufacCal = ufacCal * i;
        }
        int lfacCal = 1;
        for(int i = n-r; i >= 1; i--){
            lfacCal = lfacCal * i;
        }

        int result = ufacCal / lfacCal;
        return result;
    }
}

