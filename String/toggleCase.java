import java.util.*;

public class toggleCase {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input
        String str = sc.nextLine();
        toggleCasee(n, str);
    }

    static void toggleCasee(int n, String str) {
        StringBuilder tc = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                // Convert to lowercase
                tc.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                // Convert to uppercase
                tc.append(Character.toUpperCase(ch));
            } else {
                // If the character is not a letter (e.g., space or digit), leave it as is
                tc.append(ch);
            }
        }
        System.out.print(tc.toString());
    }
}
