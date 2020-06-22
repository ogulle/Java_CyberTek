package Resources;

import day42_Inheritance.AccessModifiers;

public class Inheritance2 extends AccessModifiers {
    //          sub                     super

    /*
    publicVariable
    protectedVariable

    publicMethod
    protectedMethod
     */

    public static void main(String[] args) {
        System.out.println(Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);

        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();


    }


}
