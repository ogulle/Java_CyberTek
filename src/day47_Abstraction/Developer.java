package day47_Abstraction;

public class Developer extends Employee{

    public String name;
    public int age;
    public char gender;
    private final double salary;
    public String jobTitle;

    public Developer(String name, int age, char gender, double salary, String jobTitle){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(name + " is working now");
    }

    public String toString(){
        return name + ", " + age + ", " + gender + ", $" + salary + ", " + jobTitle;
    }
}
