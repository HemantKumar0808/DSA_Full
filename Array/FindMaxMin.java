import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size to create array");
        int size = sc.nextInt();
        int arr[] = new int[size];

//        input
        System.out.println("enter array values (array elements)");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

//        int arr[] = {1,3,4,6,15,8}; // 0,1,2,3,4



//        output max
        System.out.println("this is your output");
        int max = arr[0];
        int maxindex = 0;
        for (int i=0; i < size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                maxindex= i;
            }
        }
        System.out.println("max is "+ max);
        System.out.println("max index is "+ maxindex);

//        output min

        int min = arr[0];
        int minindex = 0;
        for (int i = 0; i<size; i++)
        {
            if(arr[i]<min)
            {
            min=arr[i];
            minindex=i;
            }
        }
        System.out.println("min is " + min);
        System.out.println("min index is " + minindex);

    }
}
