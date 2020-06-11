package day42_Inheritance.Task01;
/*
create a class called company:
                    create 3 objects of employee and set their info
                    create an array of employees and store all those employee objects
                    use regular for loop to print out each employee' name and employeeID
 */
/*
public static Employee employee1 = new Employee();
public static Employee  employee2 = new Employee();
public static Employee  employee3 = new Employee();

static{

        employee1.setEmployeeInfo("Messi", 32, 'M', 140_000, 13654,"SDET");

        employee2.setEmployeeInfo("Aigerim", 18, 'F', 130_000, 65654,"QA");

        employee3.setEmployeeInfo("Safar", 25, 'M', 128_000, 6599,"BA");

        }

 */
public class Company extends Person{
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setEmployeeInfo("Osman",30,'M',96300.50,1234456,"Developer");

        Employee employee2 = new Employee();
        employee2.setEmployeeInfo("Habibe",29, 'F',36900.50,64681,"SDET");

        Employee employee3 = new Employee();
        employee3.setEmployeeInfo("Zeynep",1,'F',123000.50,34,"Owner");

        Employee[] employees = {employee1,employee2,employee3};


        for(Employee each: employees){
            System.out.println(each);
        }



    }
}
