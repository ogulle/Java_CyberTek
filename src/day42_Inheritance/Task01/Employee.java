package day42_Inheritance.Task01;
/*
 create a class called Employee
                attributes: name, age, gender, Salary, employeeID, jobTitle
                methods: work, setEmployeeInfo, toString
 */
public class Employee extends Person{
/*
     name (inherited)
     age (inherited)
     gender (inherited)
     Salary
     employeeID
     jobTitle
     setPersonInfo() (inherited)
     eat() (inherited)
     sleep() (inherited)
     walk() (inherited)
     drink() (inherited)
    setEmployeeInfo()
    Work()
    toString()
     */

    public double salary;
    public long employeeID;
    public String jobTitle;
    public static String companyName = "Cybertek";

    public void work(){
        System.out.println(name+" is working");
    }

    public void setEmployeeInfo(String name, int age, char gender, double salary, long employeeID, String jobTitle){
        setPersonInfo(name,age,gender);
        this.salary = salary;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+", Salary: "+salary+", ID: "+employeeID+", Title: "+jobTitle+", Company: "+companyName;
    }



}
