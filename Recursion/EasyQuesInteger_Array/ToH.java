package EasyQuesInteger_Array;

import java.util.Scanner;

public class ToH {

    static void towersOfHanoi(int n, char source, char dest, char helper) {
        if (n == 0) {
//            System.out.println("Moving ring " + n + " from " + source + " to " + dest);
            return;
        }
        // Step 1: Move n-1 disks from source to helper
        towersOfHanoi(n - 1, source, helper, dest);

        // Step 2: Move the nth disk from source to dest
        System.out.println("Moving ring " + n + " from " + source + " to " + dest);

        // Step 3: Move n-1 disks from helper to dest
        towersOfHanoi(n - 1, helper, dest, source);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towersOfHanoi(n, 'A', 'B', 'C'); // move n disks from A to B using C as helper
    }
}

