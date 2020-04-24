package day26_MethodOverloading;
/*
1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
	2. use the above method to create another called uniques that accepts a string parameter and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"
 */
public class Frequency {
    public static void main(String[] args) {

        String str = "AAA";
        char ch = 'A';
        int count = Frequency(str,ch);

        System.out.println(count);


    }

    public static int Frequency(String str, char ch){
        str = "AAA";
        char[] strArray = str.toCharArray();
        ch = 'A';

        int count = 0;
        for(char eachMatch : strArray){
            if(eachMatch==ch){
                count++;
            }
        }
        return count;

    }

}
