package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet[] carpet1 = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

            carpet1[0].customOrder(7,8.5,20,true);
            carpet1[1].customOrder(10,15,30,false);
            carpet1[2].customOrder(9,20,15,true);
            carpet1[3].customOrder(20,18,25,false);
            carpet1[4].customOrder(35,45,35,true);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();

            for(Carpet eachPersian : carpet1){
                if(eachPersian.isPersian){
                    persianCarpets.add(eachPersian);
                }
            }

        System.out.println("There are " + persianCarpets.size() + " persian carpets");

        System.out.println(persianCarpets.get(0).calCost());
        System.out.println(persianCarpets.get(1).calCost());

        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpet1));
        regularCarpets.removeAll(persianCarpets);

        System.out.println("There are " + regularCarpets.size() + " regular carpets");

        for(int i=0; i<regularCarpets.size(); i++) {
            System.out.println(regularCarpets.get(i).calCost());
        }








    }
}
