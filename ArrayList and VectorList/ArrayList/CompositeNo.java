package ArrayList;

import java.util.*;

class CompositeNo
{

    static ArrayList<Integer> removeComposite(int arr[], int len)
    {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < len; i++){
            int count = 0;
            for (int j = 2; j < arr[i]; j++){
                if( arr[i] % j == 0){
                    count++;
                }
                if(count == 1){

                }
            }
        }
        return result;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = removeComposite(arr, n);
        for(int val : list) System.out.print(val+" ");

    }
}

//4
//3 12 13 15

