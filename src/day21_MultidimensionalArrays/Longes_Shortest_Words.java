package day21_MultidimensionalArrays;

public class Longes_Shortest_Words {
    public static void main(String[] args) {
        String[] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana", "asdasasdasffaf"};

        int maxLengthString = names[0].length();
        int minLengthString = names[0].length();
        String longestWord = names[0];
        String shortestWord = names[0];

        for (int i =1; i<names.length ; i++){
            if(maxLengthString < names[i].length()){
                maxLengthString = names[i].length();
                longestWord = names[i];
            }
            if(minLengthString > names[i].length()){
                minLengthString = names[i].length();
                shortestWord = names[i];
            }
        }

        System.out.println(longestWord);
        System.out.println(shortestWord);


    }
}
