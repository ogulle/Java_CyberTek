package day05_Unary_ShorthandOperators;

public class primitiveCasting {
    public static void main(String[] args) {

        // implicit casting: done automatically
        int a = 10;
        long b = a; // implicit casting is done automatically
            // b = 10L;

        // int c = b; //b is still long datatype


        int a1 = 100;
        long b1 = (long) a1;       // manually implicit casting

        // int c1 = b1;


        // eplicit casting :
            int Inum = 100;
            byte Bnum = (byte)Inum;

            short Snum = (byte)Inum;

            double Dnum = 6.75;
            // float Fnum = (float) Dnum: //5.5

            long Fnum = (byte) Dnum; //5.0
            //Fnum = (int)5.5

        System.out.println(Fnum);


        float F1 = 60.5f;
        int I1 = (int) F1;
        System.out.println(I1);

        float F2 = 130.645f;
        byte B1 = (byte) F2;
        System.out.println(B1);

        long largeNum = 99999999999999L;

        int intNum = (int) largeNum;
            // it gives a different number num because 99999999 is out of int range


        char ch1 = 'a';

        short sh1 = (short) ch1;
        System.out.println(sh1);





    }
}
