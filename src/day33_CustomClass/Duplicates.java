package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Duplicates {
    /*
2. write a program that can return the duplicated objects from a an ArrayList of Integers
            Ex:
                list: {1,1,2,3,4,5,5}
                sout(list); ==> {1,1,5,5};
        Note: 1. DO NOT use any extra arrayList
              2. DO NOT use any loops
              3. DO NOT use any sort method
              4. Use predicate and collections methods only
 */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        Predicate<Integer> frequency = x -> Collections.frequency(list, x) == 1 ; // if the object is unique than one, we remove it
        System.out.println(list);
        list.removeIf(frequency);

        ArrayList<Integer> result = new ArrayList<>();  //expected result: [1,2,3]

        for(Integer each : list){  // each: 1, 1, 2, 2, 3, 3
            if( !result.contains(each)){
                result.add(each);
            }
        }
        System.out.println(result);





    }
}
