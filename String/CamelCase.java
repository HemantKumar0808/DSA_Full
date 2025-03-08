import java.util.*;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            camelCase(s);
            System.out.println();

        }
    }

    static void camelCase(String s) {
        // your code here
        StringBuilder result = new StringBuilder(); // To build the modified string

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '_') {
                // Skip the underscore, and capitalize the next character if it exists
                if (i + 1 < s.length()) {
                    result.append(Character.toUpperCase(s.charAt(i + 1)));
                    i++; // Skip the next character since it's already added
                }
            } else {
                result.append(current); // Add the current character to the result
            }
        }

        System.out.print(result); // Print the final result
    }
}

