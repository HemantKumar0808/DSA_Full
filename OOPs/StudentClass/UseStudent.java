package StudentClass;

public class UseStudent {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Hemant",88.2);
        s1.getAll();

        System.out.println("After Name Change");

//        s1.setRoll(-20);
        s1.setName("Hemu");
//        s1.setPer(-80.5);
        s1.getAll();
       int a = 10;
       int b = 20;
        System.out.println(Math.max(a,b));

    }
}


