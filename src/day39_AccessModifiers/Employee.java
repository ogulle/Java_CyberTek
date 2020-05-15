package day39_AccessModifiers;

public class Employee {
    String name;
    String jobTitle;
    int id;
    double salary;
    char gender;
    static String companyName = "BOA";

    public Employee (String name){
        this.name = name;
    }
    public Employee (String name, String  jobTitle){
        this(name);
        this.jobTitle = jobTitle;
    }
    public Employee (String name, String  jobTitle,int id){
        this(name,jobTitle);
        this.id = id;
    }
    public Employee (String name, String  jobTitle, int id, double salary){
        this(name,jobTitle,id);
        this.salary = salary;
    }
    public Employee (String name, String  jobTitle, int id, double salary, char gender){
        this(name,jobTitle,id,salary);
        this.gender = gender;
    }
    public String toString(){
        return "Name: "+name+" ID: "+id+" Job Title: "+jobTitle+" Company Name: "+companyName+" Salary: "+salary+" Gender:"+gender;
    }





}
