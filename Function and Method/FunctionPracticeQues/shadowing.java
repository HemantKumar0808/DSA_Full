public class shadowing {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x);
//        fun();
//       int x = 50;
        x = 100;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
