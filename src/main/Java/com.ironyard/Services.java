package com.ironyard;

/**
 * Created by Tom on 10/17/16.
 */
public class Services {
    public static void explode(String y) {

        String x = "explode(\"" + y + "\")-->";
        char[] array = y.toCharArray();
        //**** length is always one more than position i.e. the string
        // "Hello" have a len of 5 but its final letter will be in position 4 ***

        System.out.print(x);
        System.out.print("\"");
        for (int i = 0; i < y.length(); i++) {
            System.out.print(array[i]);
            if (array.length == i + 1) {
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\"");
    }

    public static void notString(String y) {
        String x = "Not String (\"" + y + "\")-->";

        if (y.startsWith("not") || y.startsWith("Not")) {
            System.out.print(x + "\"" + y + "\"");
        } else {
            System.out.print(x);
            System.out.print("\""+ "Not" +" " + y + "\"");
        }
    }

    public static void missingChar(String y, int z) {

        String x = "Missing Character (\"" + y + "\")-->";
        String xyz = y.substring(0, z) + y.substring(z + 1);

        System.out.print(x + "\"" + xyz + "\"");
    }

    public static void frontBack(String y) {
        if (y.length() > 1) {

            String a = "Front back (\"" + y + "\")-->";

            String x = y.substring(1, y.length() - 1);

            System.out.print(a + "\"" + y.charAt(y.length() - 1) + x + y.charAt(0) + "\"");
        }
    }

    public static void frontThree(String y) {
        System.out.print("Front Three(\"" + y + "\")" + "->");
        System.out.print("\"");
        char[] chars = y.toCharArray();
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {

                System.out.print(chars[x]);
            }
        }
        System.out.print("\"");

    }

    public static void backAround(String y) {
        System.out.print("Back Around(\"" + y + "\")" + "->");
        String x = y.substring(y.length() - 1);

        System.out.print("\"" + x + y + x + "\"");

    }

    public static void front22(String y) {
        if (y.length() > 2) {
            String x = y.substring(0, 2);
            System.out.print("Front 22(\"" + y + "\")" + "->");
            System.out.print("\"" + x + y + x + "\"");
        } else {
            System.out.print("Front 22(\"" + y + "\")" + "->");
            System.out.print(y + y + y);
        }
    }

    public static void deleteDel(String y) {
        String text = ("Delete Del(\"" + y + "\")" + "->");
        String oneFour = y.substring(1, 4);
        if (oneFour.startsWith("del") || oneFour.startsWith("Del")) {
            String newFront = y.substring(0, 1);
            String newButt = y.substring(4, y.length());

            System.out.print(text + "\"" + newFront + newButt + "\"");
        } else {
            System.out.print(text + "\"" + y + "\"");
        }
    }

    public static void startOz(String y) {
        String text = ("Start Oz(\"" + y + "\")" + "->");
        if (y.length() >= 2) {
            if (y.substring(0, 1).startsWith("o") || y.substring(0, 1).startsWith("O") &&
                    (y.substring(1, 2).startsWith("z") || y.substring(1, 2).startsWith("Z"))) {
                System.out.print(text + "\"" + y.substring(0, 2) + "\"");

            }
            else if ( (y.substring(1, 2).startsWith("z") || y.substring(1, 2).startsWith("Z"))){
                String x = y.substring(1,2);
                System.out.print(text + "\"" + x + "\"");
            }
            else {
                System.out.print(text + "\"" + y.substring(0, 2) + "\"");

            }
        }
    }
    public static void endUP(String y) {
        String text = ("End Up(\"" + y + "\")" + "->");
        if(y.length() == 3){
            System.out.print(text + "\"" + y.substring(0,3).toUpperCase() + "\"");
        }
        else if (y.length()>=3){
            String x = y.substring(y.length()-3, y.length());
            String a = y.substring(0,y.length()-3);
            System.out.print(text + "\"" + a + x.toUpperCase() +"\"");
        }
        else{
            System.out.print("Enter a bigger word next time");
        }
    }


    public static void javaKata() {
        System.out.print("      _                    _  __     _        \n" +
                "     | |                  | |/ /    | |       \n" +
                "     | | __ ___   ____ _  | ' / __ _| |_ __ _ \n" +
                " _   | |/ _` \\ \\ / / _` | |  < / _` | __/ _` |\n" +
                "| |__| | (_| |\\ V / (_| | | . \\ (_| | || (_| |\n" +
                " \\____/ \\__,_| \\_/ \\__,_| |_|\\_\\__,_|\\__\\__,_|\n" +
                "                                              ");
        System.out.print("...now with 100% more methods!");
    }
}
