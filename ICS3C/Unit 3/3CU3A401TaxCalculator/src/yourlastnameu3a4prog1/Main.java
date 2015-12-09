/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package yourlastnameu3a4prog1;

//Students header should go here

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);
                                                        //Students comments should appear here
        int age;                                        //throughout the program
        double pay, taxesOwed;
        final double FIRSTTAXRATE = 0;
        final double SECONDTAXRATE = 0.25;
        final double THIRDTAXRATE = 0.35;
        final double FOURTHTAXRATE = 0.45;
        final double FIFTHTAXRATE = 0.20;

        taxesOwed=0;
        System.out.println ("****************************");
        System.out.println ("***FLASHTOWN TAX SOFTWARE***");
        System.out.println ("****************************");
        System.out.println ();

        System.out.println ("By entering your age and pay this software");
        System.out.println ("will calculate the amount of taxes to be paid.");
        System.out.println ();

        System.out.print ("Please enter your age: ");
        age = keyedInput.nextInt();
        System.out.print ("Please enter your pay: ");
        pay = keyedInput.nextDouble();
        System.out.println ();

        if (age<18 | age>64)
            {taxesOwed = pay*FIRSTTAXRATE;}
         else if (age>=18 & age <=25)
            {taxesOwed = pay*SECONDTAXRATE;}
         else if (age>=26 & age <=35)
            {taxesOwed = pay*THIRDTAXRATE;}
         else if (age>=36 & age <=55)
            {taxesOwed = pay*FOURTHTAXRATE;}
         else if (age>=56 & age <=64)
            {taxesOwed = pay*FIFTHTAXRATE;}

        if (age<0 | pay<0)
        {System.out.println ("Sorry, one of the values entered is not valid.");}
          else
        {System.out.print("Your taxes owed: $ ");
         System.out.format("%.2f%n", taxesOwed);}

        System.out.println ();
        System.out.println ("****************************");
        System.out.println ("***FLASHTOWN TAX SOFTWARE***");
        System.out.println ("****************************");
   
    }

}
