package day10_Switch_Scanner;

public class daysInMonths {
    public static void main(String[] args) {
        int num = 1;
        int number;
        String month = " days";
        number = (num == 2) ? 28 : (num == 4 || num == 6 || num == 9 || num == 11) ? 30 : (num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12) ? 31 : 0;
        System.out.println(number+month);
    }
}
