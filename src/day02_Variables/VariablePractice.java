package day02_Variables;

public class VariablePractice {
    public static void main(String[] args) {
        /*
        salary, federal tax, statetax, loan, ss
         */

            int salary = 12000;
            double federalTax = 0.18;
            float stateTax = 0.065f;
            // salary after tax = salary(1-sum of taxes)

        double sumTaxes = federalTax + stateTax;

        double salaryAfterTax = salary * (1 - sumTaxes);

        System.out.println(salaryAfterTax);

        System.out.println("===================================") ;


        // area of a circle = r * r * pi

        double radius = 5.5;
        float pi = 3.14f;

        double AreaofaCircle = radius * radius * pi;

        System.out.println(AreaofaCircle);


        System.out.println("========================================");

        double kg = 60;
        double pound = kg * 2.25;
        System.out.println(pound);
    }
}
