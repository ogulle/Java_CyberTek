package day45_Exceptions;

import java.util.NoSuchElementException;
// chrome, firefox, opera...
public class ThrowKeyWord {

    public static void main(String[] args) {

        NoSuchElementException obj = new NoSuchElementException();

        // throw obj;

        // throw new NoSuchElementException();

        // System.out.println();

        /*
        boolean breakTime = true;

        if(breakTime){
            throw new RuntimeException("It's break time, we should take a break");
        }
         */


        // throw new IOException();


        int[] arr = {5,6,7};

        //    System.out.println(arr[100]);
        //   System.out.println( 9 / 0 );

        //  throw new RuntimeException();
        // System.out.println();

        try {
            throw new RuntimeException();
        }catch (Exception e){

        }

    }
}
