package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

 /*
    Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1, 0, 2, 0, 3, 0, 4, 0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declare  any extra lists
     */

public class MoveZeros {
    public static void main(String[] args) {
        Integer[] numbers = {1, 0, 2, 0, 3, 0, 4, 0};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(numbers));

        System.out.println(list);

        Integer count = 0;
        Integer zero = 0;
        for(Integer each : numbers){
            if (each == 0){
                count++;
            }
        }
        list.removeAll(Arrays.asList(0));
        for(int i =0; i<count; i++){
            list.add(zero);
        }
        System.out.println(list);

        System.out.println("++++++++++++++++++Muhtar`s Method++++++++++++++++");

        ArrayList<Integer> list1 = new ArrayList<>();
        list.addAll(Arrays.asList(10, 0, 20, 0, 30, 0, 40, 0, 0, 0) );
        System.out.println(list);

        int count1 = 0;
        for(Integer each : list){
            if(each == 0){  // finding the frequency of zeros
                count++;
            }
        }

        System.out.println(count);

        // [1,2,3,4]
        list.removeAll( Arrays.asList(0) ); // removed all the zeros from the list
        System.out.println(list);

        //[1,2,3,4,0,0,0,..]
        for(int i =0; i < count; i++ ){
            list.add(0);
        }

        System.out.println(list);






    }
}
