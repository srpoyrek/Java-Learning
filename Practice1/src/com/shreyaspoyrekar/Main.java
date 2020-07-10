package com.shreyaspoyrekar;

import org.w3c.dom.ls.LSOutput;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    // 8  primitives types
        byte myAge = 23; // 1 byte  [-128, 127]
        short likes = 10_000; // 2  [-32K, 32K]
        int subscriberCount = 1_000_000_000; // 4 bytes  [-2B, 2B]
        long viewCount = 100_000_000_000L; // 8 bytes
        float price = 10.99F; // 4 bytes
        double length = 100.979; // 8 bytes
        char letter = 'A'; // byte
        boolean subFlag = true;

        // reference type
        // date object
        Date now = new Date();
        //System.out.println(now);
        // point by reference store the reference of the same data . copying copys the reference, so if changed the another instance then changes the reference data as well.
        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 1 ;
        //System.out.println(point2);

        //Strings are reference type
        //String message = new String("Hello World!");
       // System.out.println(message);
        String message = "  Hello World!" + "Shreyas & Java";
        /* multi-line comment
        System.out.println(message);
        System.out.println(message.endsWith("!!")); // method for checking
        System.out.println(message.length()); //method to get the length
        System.out.println(message.indexOf("H")); // method to find the index
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("sky")); // returns -1 does not exist
        System.out.println(message.indexOf("Shreyas")); // returns -1 does not exist
        System.out.println(message.replace("Shreyas","Shreyas Poyrekar")); //method to replce
        System.out.println(message); // above did not replace the orignial mesage
        System.out.println(message.toLowerCase()); //method to convert to lowercase
        System.out.println(message.trim()); //removes all whitespaces removed.
        */

        //Special Characters in Strings
        String message2 = " Hello \"Mosh\""; // backslash to quote
        String dir =  "C:\\Windows\\..\tthis is a tab\t..."; // backslash to backslash \t for tab
        /*
        System.out.println(message2);
        System.out.println(dir);
        */

        // arrays in java
        //it is also reference type
        int[] numbers = new int[5];// int size & type
        numbers[0] = 1;
        numbers[1] = 2;
        /*
        System.out.println(numbers); // java returns strings which is the calculated base address of the array object
        System.out.println(Arrays.toString(numbers)); // method overload of toString Array is a class imported.
        //empty elements are initialized as 0
        */

        boolean[] flags = new boolean[5] ;// boolean array
        flags[0] = true;
        flags[1] = false;
        //System.out.println(Arrays.toString(flags));
        //empty elements are initialized as false or zero

        String[] messages = new String[5]; // String Array
        messages[0] = "Shreyas is Fine.";
        //System.out.println(Arrays.toString(messages));
        ///empty elements are initialized as null

        // initialize array another method if known the items ahead of time
        int[] numbers1 = {10,2,3,4,5,6,7,8,9,1};
        /*
        System.out.println(numbers1.length); //array length function does not have ()
        System.out.println(Arrays.toString(numbers1));
        // array have fixed size, to change the size need collection class
         */
        Arrays.sort(numbers1); // will sort array
        //System.out.println(Arrays.toString(numbers1));

        int[][][] twoDimNumbers = new int[2][2][10]; //2D Arrays
        twoDimNumbers[0][0][0] = 1;
        /*
        System.out.println(Arrays.toString(twoDimNumbers));
        System.out.println(Arrays.deepToString(twoDimNumbers)); // to print multidimensional packages

         */
        int[][] twoDimNumbers1 = {{1,2,3,4},{0,0,0,1}}; //2D Arrays
        //System.out.println(Arrays.deepToString(twoDimNumbers1)); // to print multidimensional packages

        final float pi =3.14F;
        //pi = 1; // exception will arise final variables are constants
        //System.out.println(pi);

        //increment decrement
        int x = 1;
        int y = x++; // x-- or --x or ++x
        /*
        System.out.println(x);
        System.out.println(y);
         */

        //Implicit Casting happens whenever we are not going to loose data
        //byte > Short > int > long > float > double if this then implicit casting happens if is reverse then specific casting needs to be done
        /*
        System.out.println(Integer.parseInt("1")); // this takes a string and returns a integer //there are other wrapper classes like integer i.e short, byte ....double
        System.out.println(Float.parseFloat("1.1"));
         */
        /*
        System.out.println(Math.round(1.1F));
        System.out.println(Math.ceil(1.1F));
         */
    }
}
