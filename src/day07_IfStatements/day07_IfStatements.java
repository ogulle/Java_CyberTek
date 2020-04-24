package day07_IfStatements;

public class day07_IfStatements {
    public static void main(String[] args) {
        int a = 30, b = 60, c = 90;
        int sum = a + b + c;
        if (sum == 180){
            System.out.println("Triangle is Valid");
        }
        else{
            System.out.println("Triangle is not valid");
        }

        System.out.println("==================");

        int x=10, y=5, z=23;
        if (x>y && x>z){
                    System.out.println("Greatest Number is: " + x);
                    if (y>z){
                        System.out.println("Least Number is: " + z);
                        System.out.println("Median is: " + y);
            }
            else {
                System.out.println("Least Number is: " + y);
                System.out.println("Median is: " + z);
            }
        }
        else if (y>x && y>z){
            System.out.println("Greatest Number is: " + y);
            if (x>z){
                System.out.println("Least Number is: " + z);
                System.out.println("Median is: " + x);
            }
            else {
                System.out.println("Least Number is: " + x);
                System.out.println("Median is: " + z);
            }
        }
        else if (z>x && z>y){
            System.out.println("Greatest Number is: " + z);
            if (y>x){
                System.out.println("Least Number is: " + x);
                System.out.println("Median is: " + y);
            }
            else {
                System.out.println("Least Number is: " + y);
                System.out.println("Median is: " + x);
            }
        }

        System.out.println("================");


    }
}
