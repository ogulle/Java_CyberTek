package day24_Methods;

public class MethodOverloading {
    public static void main(String[] args) {
        method(10); //'original method'
        method(10.0); //'overloaded method

    }

    public static void method(int a){
        System.out.println("Original method");
    }

    public static void method(double a){
        System.out.println("Overloaded method");

    }

}
