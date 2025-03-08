import java.util.Scanner;

public class numberrotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();


//        find no. of digit
        int nod = n;
        int count = 0;
        while(nod>0){
            count++;
             nod/=10;
        }


        k= k % count; // if k is larger from no of digits

        if(k<0){ // k for -ve no.
            k=k+count;
        }




//        create div and mul as k
        int div = 1;
        int mul = 1;
        for(int i=1; i <= count; i++){
            if (i<=k){
                div = div * 10;
            }else{
                mul = mul * 10;
            }
        }

//        for final result
        int rem = n % div;
        int divr = n / div;
        int result = rem * mul + divr;
        System.out.println(result);




















//        int n = 25398;
//
//        int rem = 25398 % 100;
//        int div = 25398 / 100;
//
//        int result = rem * 1000 +div;
//        System.out.println(result);
    }
}
