/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ouncesgrams;
import java.io.*;
import java.text.*; //need for DecimalFormat class
/**
 *
 * @author 
 */
public class OuncesGrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Using the decimal format method
         DecimalFormat twoDigit = new DecimalFormat ("#,##0.00"); //formats to 2 decimal places

         System.out.println("Ounces => Grams Conversion Chart");
         System.out.println("This program will print out a titled table that can be \nused to convert ounces to grams, for values from 1 to 15 ounces. \n(1 ounce = 28.35 grams)");
  System.out.println("\nOunces    \tGrams");

  for (int i = 1; i<=15; i++){//repeats code up to i is 15
        //This IF statement is used to add the extra spacing for numbers 1 to 9 so that it aligns properly.
      if (i<=9){
    System.out.print(i+" \t\t");//prints the amount of ounces
    System.out.print(twoDigit.format (i*28.35));//multiplies the amount of ounces by 28.35 to get grams and prints it
    System.out.println();
}
 else{
    System.out.print(i+"\t\t");//prints the amount of ounces
    System.out.print(twoDigit.format (i*28.35));//multiplies the amount of ounces by 28.35 to get grams and prints it
    System.out.println();
      }
    }//closes i for loop
  
    }

}
