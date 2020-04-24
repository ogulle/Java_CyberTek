package day23_methods;

public class uniquesValues {
    public static void main(String[] args) {
        String[] arr = {"A", "A", "B", "C", "C", "D", "E", "F"};


        String unique = "";
        for (String eachUnique : arr) {
            int count = 0;
            for (String eachRepeat : arr) {

                if (eachUnique.equals(eachRepeat)) {
                    count++;

                }

            }
            if (count == 1) {
                unique += eachUnique;
            }


        }
        System.out.println(unique);

        System.out.println("====================");
        String un = "";
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("======================");

        String freq = "";
        for (String eachUnique : arr) {
            int count = 0;
            for (String eachRepeat : arr) {

                if (eachUnique.equals(eachRepeat)) {
                    count++;

                }

            }
            if (count == 1) {
                freq += eachUnique;
            }



        }



    }
}