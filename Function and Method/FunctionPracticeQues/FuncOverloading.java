public class FuncOverloading {
    public static void main(String[] args) {
        fun(12);
        fun(3,5);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int a, int b){
        System.out.println(a + b);
    }
}
