package day30_ArrayList;
/*
     3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    ex: list==> {1,1,2,3,3,4,5}
    uniques ==> {2,4,5}
    */

import java.util.ArrayList;

public class Uniques {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();    //{1,2,1]
            list.add(1);
            list.add(2);
            list.add(1);
            list.add(3);
            list.add(4);


            ArrayList<Integer> uniques = new ArrayList<>();

            for (Integer each2 : list){
                int count = 0;
                for(Integer each : list){
                    if(each==each2){
                        count++;
                    }
                }
                if(count==1){
                    uniques.add(each2);
                }
            }
        System.out.println(uniques);

/*
for(int i =0; i < list.size(); i++){

            int count = 0;
            for(Integer each  : list ){
                if(each == list.get(i) ){  // 0  1 2
                    count++;
                }
            }
            if(count == 1){
                uniques.add(list.get(i)); // 0 1 2
            }


        }
 */



    }
}
