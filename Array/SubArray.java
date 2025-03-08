import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



//      start
        for (int i = 0; i < n; i++) {
//            end
            for(int j = i; j < n; j++){

                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]);
                }
            System.out.print(" ");
            }
            System.out.println();
        }
    }
}
