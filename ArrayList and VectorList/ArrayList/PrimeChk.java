import java.util.ArrayList;
import java.util.Scanner;

public class PrimeChk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int[] arr = {2,3,4,5,9,7}; // 2 3 5 7

        ArrayList <Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 2; j < arr[i]; j++){
                if( arr[i] % j == 0){
                    count++;
                }
            }
                if(count > 2){
                    result.add(arr[i]);
                }else{
//                    result.add(arr[i]);
                }
        }

        System.out.println(result);
    }
}
