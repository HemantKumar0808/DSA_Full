package StudentClass;

public class Student {
    private int roll;
    private String name;
    private double per;

    public Student (int r, String n, double p){
        roll = r;
        name = n;
        per = p;
    }
//    public void setRoll(int r){
//        if(r <=0 ){
//            System.out.println("-VE Can not be Provide. . .");
//            return;
//        }
//        roll = r;
//    }
    public void setName(String n){
        name = n;
    }
//    public void setPer(double p){
//        per = p;
//    }

    public void getAll(){
        System.out.println(roll);
        System.out.println(name);
        System.out.println(per);
    }
    public void getRoll(){
        System.out.println(roll);

    }
    public void getName(){
        System.out.println(name);
    }
    public void getPer(){

        System.out.println(per);
    }

}
