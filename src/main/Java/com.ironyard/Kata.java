package com.ironyard;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Tom on 10/17/16.
 */
public class Kata {

     public static void main(String[] args) {

         System.out.println("");
         explode("EXPLOSIVO");
         System.out.println(" ");
         System.out.println(" ");
         notString("NotHello");
         System.out.println(" ");
         System.out.println(" ");

         missingChar("Hello",0);

 }

     public static void explode(String y) {

        String x = "explode(\"" + y + "\")-->";
        char[] array = y.toCharArray();


        System.out.print(x);
        System.out.print("\"");
        for (int i = 0; i < y.length(); i++) {
            System.out.print(array[i]);
            if (array.length == i +1){

            }
            else {
                System.out.print(" ");
            }

        }
        System.out.print("\"");

    }

    public static void notString(String y){
        String x = "Not String (\"" + y + "\")-->";

        if (y.startsWith("not") || y.startsWith("Not"))
        {
            System.out.print(x + "\"" + y + "\"");
        }
        else
            {
                System.out.print(x);
                System.out.print("\"Not"+ y +"\"");
        }
    }
    public static void missingChar (String y, int z) {
       String x = "Not String (\"" + y + "\")-->";
       String xyz = y.substring(0);
        String abc = y.substring(z + 0);
       System.out.println(xyz);
        System.out.print(abc);



    }
}

