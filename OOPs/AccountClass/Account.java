package AccountClass;

public class Account {
    private int id;
    private String name;
    private double balance;

//    default constructor
//    public Account(){
//        System.out.println("Hey! i am default constructor");
//    }

//    parameterise constructor
    public Account(int i, String n, double b){
        id = i;
        name = n;
        balance = b;
    }



    public void showAccount(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(balance);
    }

}
