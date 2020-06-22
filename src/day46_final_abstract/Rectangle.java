package day46_final_abstract;

public class Rectangle extends Shape {
    public double width;
    public double length;

    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    public void Area(){
        double area = width * length;
        System.out.println("Area is " + area);
    }


}
