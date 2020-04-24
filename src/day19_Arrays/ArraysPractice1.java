package day19_Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {
        String[] names = {"Mike", "Adam", "Tonny", "Ali" };

        for (int i=0; i<4; i++){
            System.out.println(names[i]);
        }


        String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};
        int len = emails.length;
        String result = "";
        System.out.println(len);
        int count = 0;
        for (int i=0; i<emails.length; i++){
            if (emails[i].contains("@gmail.com")){
                result = emails[i];
                count++;
            }

        }
        System.out.println(result);
        System.out.println(count);

    }
}
