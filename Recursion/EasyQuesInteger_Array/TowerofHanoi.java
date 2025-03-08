package EasyQuesInteger_Array;

import java.util.Scanner;

class TowerofHanoi {
    static void toh(int n, int source, int auxiliary, int destination) {
        // Base case: If there's only one disk, move it directly from source to destination
        if (n == 1) {
            System.out.println("move disk 1 from rod " + source + " to rod " + destination);
            return;
        }

        // Move top n-1 disks from source to auxiliary, using destination as a temporary rod
        toh(n - 1, source, destination, auxiliary);

        // Move the nth disk from source to destination
        System.out.println("move disk " + n + " from rod " + source + " to rod " + destination);

        // Move the n-1 disks from auxiliary to destination, using source as a temporary rod
        toh(n - 1, auxiliary, source, destination);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        // Read the number of disks
        N = sc.nextInt();

        // Call the Tower of Hanoi function
        toh(N, 1, 2, 3);

        sc.close();
    }
}

