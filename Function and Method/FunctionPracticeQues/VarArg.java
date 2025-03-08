import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
     fun(1,2,3,5,8,7,4);
     funn("Hemant","Chandan");
    }

    public static void fun(int ...a){ // array
        System.out.println(Arrays.toString(a));
    }
    public static void funn(String ...s){ // array
        System.out.println(Arrays.toString(s));
    }
}
