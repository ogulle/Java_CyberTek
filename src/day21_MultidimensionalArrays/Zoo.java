package day21_MultidimensionalArrays;

public class Zoo {
    public static void main(String[] args) {

        String[] wildAnimals = {"Tiger", "Lion", "Monkey", "Turtle", "Crocodile"};
        String[] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};

        String [][] zoo = {wildAnimals, birds};
                //              0          1

        String kfc = zoo[1][3]; // "Chicken"

        System.out.println(kfc);

        System.out.println("========================");

        for( String everyAnimal : zoo[1] ){
            if(everyAnimal.equals("Chicken")){
                continue;
            }
            System.out.println(everyAnimal);
        }

    }
}

