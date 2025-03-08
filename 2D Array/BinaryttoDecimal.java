import java.util.Scanner;

public class BinaryttoDecimal {
    static long pow(int num1,int num2)
    {
        long powAns=1;
        while(num2>0)
        {
            powAns*=num1;
            num2--;
        }
        return powAns;

    }
    public static long binaryToDecimal(long binaryNumber) {
        // write your code here

        long ans=0;
        int index=0;
        while(binaryNumber>0)
        {
            long bit=binaryNumber%10;
            ans+=(bit*pow(2,index));
            index++;
            binaryNumber=binaryNumber/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long binaryNumber = scanner.nextInt();
        System.out.println(binaryToDecimal(binaryNumber));
        scanner.close();
    }
}
