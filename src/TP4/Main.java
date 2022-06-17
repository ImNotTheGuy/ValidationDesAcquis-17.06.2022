package TP4;



/*
*
*
*
*
* */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.printf("Your sentence: ");
        String str1 = input.nextLine().toLowerCase().trim(); // trim() used for no space after and before string


        // convert string to character array
        char[] charArray = str1.toCharArray();

        // first character to uppercase as it will not be counted in the for loop
        charArray[0] = String.valueOf(charArray[0]).toUpperCase().toCharArray()[0];

        // loop through the charArray, if space detected then next char will be to uppercase
        // No risk of outOfBoundError thanks to the trim(): no space will be in last position
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' '){
                charArray[i+1] = String.valueOf(charArray[i+1]).toUpperCase().toCharArray()[0];
            }
        }

        System.out.println(String.valueOf(charArray));


    }
}
