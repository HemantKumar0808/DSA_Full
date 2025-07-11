package StudentClass;

public class UseStudent {
    public static void main(String[] args) {

        Student s;
        s = new Student();

//        s.roll = 10;
//        s.name = "Hemant";
//        s.per = 98.3;
//
//        System.out.println("roll no. : " + s.roll);
//        System.out.println("name : " + s.name);
//        System.out.println("percentage : " + s.per);

        s.setStudent(-10,"Hemant", 98.3);
        s.showStudent();

        Student p = new Student();
        p.setStudent(11,"Hemu", 99.2);
        p.showStudent();

    }
}


