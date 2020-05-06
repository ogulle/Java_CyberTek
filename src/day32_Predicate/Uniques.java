package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {

        // write a program that can return the unique objects from arraylist of characters

        Character[] chars = {'A', 'A', 'B', 'C', 'D', 'D'};
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));

        System.out.println(charList);

        ArrayList<Character> uniques = new ArrayList<>();

        for (Character each : charList){
            if(Collections.frequency(charList,each)==1){
                uniques.add(each);
            }
        }
        System.out.println(uniques);



    }
}
