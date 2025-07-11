package ProductClass;

public class UseProduct {

    public static void main(String[] args) {
        Product p;
        p = new Product();

        p.setId(11);
        p.setName("Maggi");
        p.setPrice(35.0);

        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getPrice());
    }
}
