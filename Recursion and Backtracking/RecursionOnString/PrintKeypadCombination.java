package RecursionOnString;

import java.util.Scanner;

public class PrintKeypadCombination {

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printKPC(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0); // current digit
        String code = codes[ch - '0']; // characters mapped to that digit

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i); // each character mapped
            printKPC(str.substring(1), ans + c); // go to next digit
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // take input like "78"
        printKPC(str, ""); // start recursion with empty answer
        sc.close();
    }
}

