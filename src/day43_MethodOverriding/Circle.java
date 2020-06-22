package day43_MethodOverriding;

public class Circle extends Shape {

    public double radius;
    public static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }
    /*
    calculateArea & calculatePerimeter
     */

    public void calculateArea(){
        area = radius*PI*radius;
        System.out.println("Area of the Circle: "+area);
    }

    public void calculatePerimeter(){
        perimeter = 2*PI*radius;
        System.out.println("Perimeter of the Circle: "+perimeter);
    }


}
