package day03_Variables;

public class Salary_Calculator {
    public static void main(String[] args) {
        int rate = 55;
        double stateTax = 0.04;
        double federalTax = 0.22;
        int weeklyHours = 40;
        double salary = rate * weeklyHours * 52;
        double totalTax = salary*(stateTax + federalTax);
        double incomeAfterTax = salary - totalTax;
        System.out.println("Your salary is: $" + salary);
        System.out.println("Your total tax is: $" + totalTax);
        System.out.println("Your income after tax is: $" + incomeAfterTax);
        System.out.println("incomeTexas: " + (salary - (stateTax*salary))/12);
    }
}
