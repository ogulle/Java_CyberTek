package day06_Shorthnd_LogicalOperators;

public class Task2 {
    public static void main(String[] args) {
        int number1 = 4 , number2 = 8 , number3 =1;
        if (number2>number1 && number2>number3){
            System.out.println("The Greatest number is: " + number2);
        }

        int num1 = 3, num2 = 4;
        if (num1 == num2) {
            System.out.println("Numbers are equal");
        }
        else {
            System.out.println("Numbers are not equal");
        }

        int time = 20;
        if (time < 12){
            System.out.println("Good Morning!");
        }
        if (time >= 12 && time < 15){
            System.out.println("Good Afternoon!");
        }
        if (time > 15){
            System.out.println("Good Evening!");
        }

        int numberOfWaterMelon;
        boolean lotsOfWaterMelon;
        lotsOfWaterMelon = false;
        numberOfWaterMelon = 40 ;

        if (numberOfWaterMelon >= 20 ) {
            System.out.println("I have more than 20 Watermelon");
            lotsOfWaterMelon = true;
        }
        if (lotsOfWaterMelon) {
            System.out.println("Good Job!");
        }
        if (lotsOfWaterMelon == false){
            System.out.println("I need more Watermelo000000000");
        }

    }
}
