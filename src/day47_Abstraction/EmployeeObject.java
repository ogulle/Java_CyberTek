package day47_Abstraction;

public class EmployeeObject {
    public static void main(String[] args) {

        Developer dev1 = new Developer("Osman", 30,'M',100000, "SDET");
        dev1.work();
        System.out.println(dev1);

        Tester test1 = new Tester("Habibe", 30, 'F', 100000, "Tester");
        test1.work();
        System.out.println(test1);


    }


}
