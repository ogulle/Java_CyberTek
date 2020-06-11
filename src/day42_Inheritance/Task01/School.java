package day42_Inheritance.Task01;
/*
create a class called school:
                    create 3 objects of student and set thier info
                    create a an ArrayList of students to store all student objects
                    use for each loop to print out each students' name and studentID
 */
import java.util.ArrayList;
import java.util.Arrays;

public class School extends Person{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentInfo("Osman",30,'M',963,"12A");

        Student student2 = new Student();
        student2.setStudentInfo("Habibe",29, 'F',369,"11B");

        Student student3 = new Student();
        student3.setStudentInfo("Zeynep",1,'F',123,"1C");

        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(student1,student2,student3));

        for(Student each: students){
            System.out.println(each);
        }
        /*
        for(Student each  : studentList){
            //System.out.println( each );
            System.out.println("name: "+each.name+", ID: "+each.studentID);
        }
         */



        student1.eat("Gyro");
        student2.drink("Milk");
        student3.sleep();




    }
}
