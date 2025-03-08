import java.util.Scanner;

public class func4even {
    public static int sum(int a, int b){
        int A = a+b;
        return A;
//        int B = a-b;
//        int C = a*b;
//        int D = a/b;
//        int E = a%b;
//        return A + B + C + D + E;
    }
//    static int sumNno(int n){
//        n=n*(n+1)/2;
//        return n;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int r = sumNno(n);
//        System.out.println(r);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = sum(x,y);
        System.out.println(result);

    }
}
