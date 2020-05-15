package day38_Constructors;

public class Dog {
    String name;
    String breed;
    int age;


    public Dog(){ // sets the dfeualt value for all instances
        name = "unknown";
        breed = "unknown";
        age = 0;
    }

    public Dog(String breed){
        this.breed = breed;
        name = "unknown";
        age = 0;
    }

    public Dog(String breed, int age){
        this.breed = breed;
        this.age = age;
        name = "Unknown";
    }



    public String toString(){
        return "Name: "+name +", breed: "+breed+", age: "+age;
    }


/*
    public void method1(){
    }
    public void method1(int a){
    }
 */
}
