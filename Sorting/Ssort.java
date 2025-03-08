import java.util.Arrays;
import java.util.Scanner;

public class Ssort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
//       selection sort

        Arrays.sort(arr);
//        for (int i = 0; i < n; i++) {
//            int smallest = i;
//            for(int j = i + 1; j < n; j++){
//                if(arr[smallest]>arr[j]){
//                    smallest = j;
//                }
//            }
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }



    }

}
