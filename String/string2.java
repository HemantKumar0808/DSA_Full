import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nam = new String("harry");

//        String methods
//        1. Length
        String name = "Hemant Kumar";
//        int length = name.length();
        System.out.println(name);
        System.out.println(name.length());


//        2. toLowerCase()
        System.out.println(name.toLowerCase());

//        3. toUpperCase()
        System.out.println(name.toUpperCase());

//        4. trim()
        String na = "    Hemant Kumar   ";
        System.out.println(na.trim());

//        5. substring(int start)
        System.out.println(name.substring(7));

//        6. substring(int start, int end)
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(5,name.length()));

//        7. replace('r','p');
        System.out.println(name.replace('a','e'));
        System.out.println(name.replace(' ','_'));
        System.out.println(name.replace("ma","re"));
        System.out.println(name.replace("ma","ret"));

//        8. startswith("he")
        System.out.println(name.startsWith("He"));
        System.out.println(name.startsWith("he"));

//        9. endswith()
        System.out.println(name.endsWith("ar"));
        System.out.println(name.endsWith("Ar"));

//        10. charAt
        System.out.println(name.charAt(7));

//        11. indexOf(s)
        System.out.println(name.indexOf("e"));

//        12. indexOf("e",3)
        System.out.println(name.indexOf("a",4));

//        13. lastindexOf("r")
        System.out.println(name.lastIndexOf("m"));

//        14. lastindexOf("r",2)
        System.out.println(name.lastIndexOf("m",4));

//        15. equals("hemu")
        System.out.println(name.equals("Hemant kumar"));
        System.out.println(name.equals("Hemant Kumar"));

//        16. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("hemant kumar"));

//        17. var.isEmpty()

        System.out.println(name.isEmpty());


//        Escape Sequence Characters
        String sentence = "i am a java fullstack developer";
        System.out.println(sentence);

//        \n = next line
        String sentence1 = "i am a \njava fullstack developer";
        System.out.println(sentence1);

//      \t = tab space
        String sentence2 = "i am a java full\tstack developer";
        System.out.println(sentence2);

//        \\ = backslash
        String sentence3 = "i am a java \\ fullstack developer";
        System.out.println(sentence3);

//        \' = single quote
        String sentence4 = "i am a \'java fullstack developer\'";
        System.out.println(sentence4);




    }

}
