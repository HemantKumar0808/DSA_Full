package EasyQuesInteger_Array;

public class RecursionInNO {
//    public static void main(String[] args) {
//        print1(1);
//    }
//
//    public static void print1(int n) {
//        System.out.println(n);
//        print2(2);
//    }
//    public static void print2(int n) {
//        System.out.println(n);
//        print3(3);
//    }
//    public static void print3(int n) {
//        System.out.println(n);
//        print4(4);
//    }
//    public static void print4(int n) {
//        System.out.println(n);
//        print5(5);
//    }
//    public static void print5(int n) {
//        System.out.println(n);
//    }

    public static void main(String[] args) {
        print(1);
    }

    public static void print(int n) {
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n); // task
        print(n+1); // recursive call
    }
}
