import java.util.*;

public class PainterPartition {
    // Implement the painterPartition method here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ensure input is available and handled properly
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- > 0) {
                if (sc.hasNextInt()) {
                    int N = sc.nextInt();
                    int k = sc.nextInt();
                    int[] boards = new int[N];

                    for (int i = 0; i < N; i++) {
                        if (sc.hasNextInt()) {
                            boards[i] = sc.nextInt();
                        }
                    }
                    System.out.println(painterPartition(boards, k));
                }
            }
        }
    }

    private static int painterPartition(int[] boards, int k) {
        return 0;
    }
}
