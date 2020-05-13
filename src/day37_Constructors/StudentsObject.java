package day37_Constructors;

public class StudentsObject {
    public static void main(String[] args) {
        Students student1 = new Students("Marina", 34,'F',"Cybertek");
        //student1.setInfo("Marina", 34,'F',"Cybertek");

        System.out.println(student1);

        Students student2 = new Students("Sha",35,'M',"Harvard");

        System.out.println(student2);

    }
}
