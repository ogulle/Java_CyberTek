package day38_Constructors;
/*
Create class called SalaryCalculator
                instance variables:
                    hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
                add a constructor can initialize those fields
                instance methods:
                    salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
                    stateTax(): retuns the total state tax as double ( salary * stateTaxRate)
                    federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)
                    salaryAftertax(): retuns the salary after tax as double ( salary - stateTax - federalTax)
                    toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */

public class SalaryCalculator {
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours,double stateTaxRate, double federalTaxRate){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }
    public double Salary(){//annual income
        return hourlyRate*weeklyHours*52;
    }
    public double stateTax(){//total tax paid to the state
        return Salary()*stateTaxRate;
    }
    public double federalTax(){//total tax paid to the federal
        return Salary()*federalTaxRate;
    }
    public double salaryAfterTax(){//salary after tax
        return Salary()-stateTax()-federalTax();
    }
    public String toString(){
        return "Hourly Rate: $"+hourlyRate+
                "\nWeekly Hour: "+weeklyHours+
                "\nGross Salary: $"+Salary()+
                "\nState Tax: $"+stateTax()+
                "\nFederal Tax: $"+federalTax()+
                "\nNet Salary: $"+salaryAfterTax();
    }





}
