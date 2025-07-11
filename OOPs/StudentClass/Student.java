package StudentClass;

// class
public class Student{
    private int roll;
    private String name;
    private double per;


    // setter
    public void setStudent(int r, String n, double p){
        if(r < 1){
            System.out.println("Invalid Roll No");
        }else{
            roll = r;
        }

        name = n;
        per = p;
    }

//    getter
    public void showStudent(){
        System.out.println(roll);
        System.out.println(name);
        System.out.println(per);
    }
}