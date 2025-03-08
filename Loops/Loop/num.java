import java.util.Scanner;

public class num {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt();

            int count = 0;

            while (true) {
                int number = sc.nextInt();  // Read integer input
                count++;  // Increment count for each number
                if (number % 2 != 0) {  // Check if the number is odd
                    break;  // Exit the loop if an odd number is encountered
                }
            }

            System.out.println(count);  // Print the count of numbers
    }
}
