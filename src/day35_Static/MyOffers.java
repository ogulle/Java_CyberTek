package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
            offer1.setOfferInfo("Austin","Apple",100000,true);
        Offer offer2 = new Offer();
            offer2.setOfferInfo("Houston","Adobe",105000,false);
        Offer offer3 = new Offer();
            offer3.setOfferInfo("Houston","Cisco",110000,true);
        Offer offer4 = new Offer();
            offer4.setOfferInfo("San Antonio","Microsoft",120000,false);
        Offer offer5 = new Offer();
            offer5.setOfferInfo("Dallas","BankOfAmerica",100000,true);

        ArrayList<Offer> offers = new ArrayList<>();
            offers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5));

        ArrayList<Offer> goodOffers = new ArrayList<>();
            goodOffers = offers;
            goodOffers.removeIf(p-> p.isFullTime==false || !p.location.equals("Houston") || p.salary <= 100000);

        System.out.println(goodOffers.size());

        for (Offer each : goodOffers){
            System.out.println(each);
        }

        /*

    create a class called MyOffers
        Create 5 offer objects, and add them into the list of offers, and then:
            1. use for loop to print out the info of each offer
            2. write a program that can only retain the offers if:
                    1. the offer is for fulltime position
                    2. offer is from your local area
                    3. salary is greater than 100K


        public static void main(String[] args) {

            Offer offer1 = new Offer();
            offer1.setInfo("VA", "BOA", 100000, true);

            Offer offer2 = new Offer();
            offer2.setInfo("KY", "CapitalOne", 120000, false);

            Offer offer3 = new Offer();
            offer3.setInfo("MD","Chase",95000,true);

            Offer offer4 = new Offer();
            offer4.setInfo("BayArea","Google",115_000,false);

            Offer[] offers = {offer1, offer2, offer3, offer4};

            String myLocation = "VA";  // my current state

            ArrayList<Offer> Accept = new ArrayList<>( Arrays.asList(offers) );
            // Accept.removeIf(  p ->  p.salary < 100000 ||  p.isFullTime == false || !p.location.equals(myLocation)  ); // we remove the offer if it's less than 100K or not full time
            Accept.removeIf(p ->  p.salary < 100000 );
            Accept.removeIf(p -> p.isFullTime == false );
            Accept.removeIf( p -> !p.location.equals(myLocation));

            System.out.println(Accept.size());
            for(Offer eachOffer : Accept ){
                System.out.println(eachOffer);
            }
         */









    }
}
