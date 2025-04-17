package HashMap.Questions;

import java.util.*;

class Sol {
    static boolean areAnagram(String c1, String c2) {
        //Write your code here

        if(c1.length() != c2.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < c1.length(); i++){
            char ch1 = c1.charAt(i);
            if(map.containsKey(ch1)){
                map.put(ch1,map.get(ch1)+1);
            }else{
                map.put(ch1, 1);
            }
        }


        for(int i = 0; i < c2.length(); i++){
            char ch2 = c2.charAt(i);
            if(map.containsKey(ch2)){
                map.put(ch2,map.get(ch2)-1);
            }else{
                return false;
            }

            if(map.get(ch2) == 0){
                map.remove(ch2);
            }
        }

        if(map.size() == 0){
            return true;
        }
        return false;
    }
}

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Sol Obj = new Sol();

        if (Obj.areAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

