import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        input from user
//        String name = sc.nextLine();

//        1.  concatenation
//        String firstname = "hemant";
//        String lastname = "kumar";
//        String name = firstname + " " + lastname;
//        System.out.println(name);

//        2. var__.length
//        String sentence = "my name is hemant";
//        System.out.println(sentence.length());

//        3. var__.charAt(index no.)
//        String sentence = "my name is Hemant";
//        System.out.println(sentence.charAt(11));

//        4. var__.compareTo(var 2)
        String firstname = "hemant";
        String lastname = "kumar";
        if(firstname.compareTo(lastname) == 0){ // 0 means equal
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are NOT equal");
        }

//        5. var__.substring() string mein se kuch portion ya kuch part nikalne ke liye..
//        String sentence = "my name is hemant";
//        System.out.println(sentence.substring(11,sentence.length())); // start range, end range
//        System.out.println(sentence.substring(3,7));// start range, end range
//        System.out.println(sentence.substring(3));

//        Ques 1. convert String to Integer
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

//        Ques 2. convert Integer to String
        int num = 123;
        String stR = Integer.toString(num);
        System.out.println(stR);




    }

}
