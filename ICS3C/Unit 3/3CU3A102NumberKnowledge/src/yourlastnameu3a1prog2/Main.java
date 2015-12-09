/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package yourlastnameu3a1prog2;

import java.util.Scanner;

public class Main {

    
    // student's header would appear here
     
    public static void main(String[] args) {

            Scanner keyedInput = new Scanner(System.in);

            int numberOne, numberTwo;       //student's comments would appear here

            System.out.println ("DO YOU KNOW YOUR NUMBERS?");
            System.out.println ();

            System.out.print ("Input a number that is larger than 400: ");
            numberOne = keyedInput.nextInt();
            System.out.println ();

            System.out.print ("Input a number that is less than 150: ");
            numberTwo = keyedInput.nextInt();
            System.out.println ();

            if (numberOne > 400 & numberTwo <150)
            {System.out.println ("Well done, you really know your numbers!");}
            else
            {System.out.println ("Sorry, you don't really know your numbers!");}
            }
}
