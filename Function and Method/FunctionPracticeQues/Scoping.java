public class Scoping {
    public static void main(String[] args) {
        int a = 10;  // variables initialized outside the block can be updated inside the box
        int b = 20;
        String name = "Hemu";
        {
           // int a = 100; already initialized outside the block in yhe same
            a = 100; // reassign the original ref variable to some other value
            System.out.println(a);
            int c = 99;
            System.out.println(c);
            // String name = "hello";
            name = "Hemant";
            System.out.println(name);
            // values initialized in this block, will remain in block
        }
        System.out.println(a);
        System.out.println(name);
        // System.out.println(c); // can not use inside newly created variable outside the block
    }
    // hum block ke under sirf new varible create kar sakte hai
    // lekin jo variable outside the block created hai unhe sirf reassign kar sakte hai
    // par same int a = 100; nhi create kar sakte...
 }
