package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {
        Item item1 = new Item("Potato",.75,5);
        Item item2 = new Item("Tomato",1.31,10);
        Item item3 = new Item("Egg",0.39,24);
        Item item4 = new Item("Cola",0.29,36);
        Item item5 = new Item("Onion",0.12,13);

        ArrayList<Item> shoppingList= new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1,item2,item3,item4,item5));

        double totalCost = 0;
        for (Item each: shoppingList) {
            totalCost += each.calcCost();
        }
        System.out.println("Total Cost: $"+totalCost);





    }
}
