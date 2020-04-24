package day21_MultidimensionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {

        String[] DevTeam = {"Zeynep", "Haider", "Jovid", "Muhtar"};
        String[] TestersTeam = {"Rahman", "Aishan", "Osman", "Ali"};

        String [][] ScrumTeam = {DevTeam, TestersTeam};
                //                  0,          1

        ScrumTeam[0][3] = "Jean";

        System.out.println(ScrumTeam[0][3]);

        System.out.println("=============================");

        for( String eachEmployee : ScrumTeam[0]){
            System.out.println(eachEmployee);
        }

    }
}
