import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Your code here
        int temp = n;
                int sum = 0;
                while(temp > 0){
                    int lastDigit = temp % 10;

                    sum = sum + (lastDigit * lastDigit * lastDigit);
                    temp/=10;
                }
                if(sum == n){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
        }


