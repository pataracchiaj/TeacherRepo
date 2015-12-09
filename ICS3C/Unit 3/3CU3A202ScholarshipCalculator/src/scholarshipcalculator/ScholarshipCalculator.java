/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package scholarshipcalculator;


import java.util. Scanner;

public class ScholarshipCalculator {

        public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);

        double average;

        System.out.println ("****SCHOLARSHIP****");
        System.out.println ("****CALCULATOR*****");
        System.out.println ();
        System.out.println ("Enter your high school average");
        System.out.println ("and the amount of your scholarship");
        System.out.println ("will be calculated for you");
        System.out.println ();

        System.out.print("Plese enter your high school average: ");
        average = keyedInput.nextDouble();
        System.out.println ();

         if (average >=95)
	{System.out.println ("Congratulations, you earned a $1500.00 scholarship!");}
            else if(average >=90)
	{System.out.println ("Congratulations, you earned a $1250.00 scholarship!");}
            else if(average >=85)
	{System.out.println ("Congratulations, you earned a $1000.00 scholarship!");}
            else if(average >=80)
	{System.out.println ("Congratulations, you earned a $750.00 scholarship!");}
           else if(average >=75)
	{System.out.println ("Congratulations, you earned a $500.00 scholarship!");}
            else
	{System.out.println ("Sorry, you did not earn a scholarship.67");}

        System.out.println ();
        System.out.println ("****SCHOLARSHIP****");
        System.out.println ("****CALCULATOR*****");
        
        
    }

}
