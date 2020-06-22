package day43_MethodOverriding;
/*
	1. create a class called Shape
						vairables: area, perimeter
						methods: calculateArea(), calculatePerimeter()
 */
public class Shape extends ShapeObjects {

    public double area;
    public double perimeter;

    protected void calculateArea(){
        area = 0;
        System.out.println("Area of the shape: "+area);
    }

    public void calculatePerimeter(){
        perimeter = 0;
        System.out.println("Perimeter of the shape: "+perimeter);
    }


}
