package ProductClass;

public class Product {
    private int id;
    private String name;
    private double price;

// with the help of setter and getter we also achieve encapsulation, better control, immutability...
//    setter
    public void setId(int i){
        if(i < 0){
            System.out.println("negative cannot be valid");
            return;
        }else{
            id = i;
        }
    }

    public void setName(String n){
        name = n;
    }

    public void setPrice(double p){
        price = p;
    }

//    getter
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }


}
