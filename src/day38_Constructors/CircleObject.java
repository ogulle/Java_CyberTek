package day38_Constructors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleObject {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = scan.nextInt();
        Circle circle1 = new Circle(r);
        Circle circle2 = new Circle(5);
        System.out.println(df.format(circle1.area()));

    }
}
