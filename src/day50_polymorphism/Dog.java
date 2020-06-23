package day50_polymorphism;
/*
  3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
 */
public final class Dog extends Animal{// 3 var, 3 methods
    public String dogName;

    public Dog(String dogName, int age, String gender){
        this.dogName=dogName;
        this.age=age;
        this.gender=gender;
    }

    public void bark(){
        System.out.println("Dog " + dogName + " is barking");
    }

    @Override
    public void eat(){
        System.out.println("Dog " + dogName + " is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Dog " + dogName + " is sleeping");
    }
    public static void methodA(int a){
        System.out.println("Dog Class A");
    }
}
