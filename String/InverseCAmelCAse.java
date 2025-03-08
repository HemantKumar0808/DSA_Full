import java.io.*;
import java.util.*;

public class InverseCAmelCAse {

    public static void solution(String str) {
        StringBuilder word = new StringBuilder(); // To build words dynamically

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i); // Get the current character

            // If the current character is uppercase and a word exists, print the current word
            if (Character.isUpperCase(current) && word.length() > 0) {
                System.out.println(word); // Print the accumulated word
                word.setLength(0); // Clear the StringBuilder for the next word
            }

            word.append(current); // Add the current character to the word
        }

        // Print the last word if it exists
        if (word.length() > 0) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next(); // Input Camel Case string
        solution(str); // Call the solution function
    }
}

