import java.util.*;
import java.lang.String;

public class stringCompression {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String str = "aaabbcccddaeef";
        System.out.println(Compression1(str));
        System.out.println(Compression2(str));

    }

    public static String Compression1(String str) {
        String s = str.charAt(0) + "";
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr != prev){
                s += curr;
            }
        }
        return s;
    }
    public static String Compression2(String str) {
        String s = str.charAt(0) + "";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr == prev){
                count++;
            }else{
                if(count > 1){
                    s += count;
                    count =1;
                }
                s += curr;
            }

        }
        return s;
    }

}
