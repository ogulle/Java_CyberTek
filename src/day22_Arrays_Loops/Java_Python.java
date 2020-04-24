package day22_Arrays_Loops;

public class Java_Python {
    public static void main(String[] args) {

        String sentence = "I like java and javascript python python";

        sentence = sentence.toLowerCase();
        int countJava = 0; //2
        int countPython = 0;

         String[] words = sentence.split(" "); //[I, like, java, and, javascript]

        for (String eachRepeat : words){
            if (eachRepeat.contains("java")){
                countJava ++;
            }
            if (eachRepeat.contains("python")){
                countPython ++;
            }
        }
        System.out.println(countJava);
        System.out.println(countPython);

    }
}
