/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bballstats;


import java.util. Scanner;

public class BBallStats {

        public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);

        int assists, points, rebounds;

        System.out.println ("****DOUBLE-DOUBLE****");
        System.out.println ("****TRIPLE-DOUBLE****");
        System.out.println ("*****CALCULATOR******");
        System.out.println ();
        System.out.println ("Enter your statistics and it will be");
        System.out.println ("determined whether or not you obtained either");
        System.out.println ("a double-double or a triple-double");
        System.out.println ();

        System.out.print("Plese enter the number of points scored: ");
        points = keyedInput.nextInt();
        System.out.println ();

        System.out.print("Plese enter the number of assists obtained: ");
        assists = keyedInput.nextInt();
        System.out.println ();

        System.out.print ("Plese enter the number of rebounds obtained: ");
        rebounds = keyedInput.nextInt();
        System.out.println ();

        if (points >= 10 & assists >= 10 & rebounds >= 10)
	{System.out.println ("Congratulations, you earned a triple-double!");}
            else if(points >= 10 & assists >= 10)
	{System.out.println ("Congratulations, you earned a double-double!");}
            else if(points >= 10 & rebounds >= 10)
	{System.out.println ("Congratulations, you earned a double-double!");}
            else if(rebounds >= 10 & assists >= 10)
	{System.out.println ("Congratulations, you earned a double-double!");}
            else
	{System.out.println ("Sorry, you did not earn a double-double or a triple-double");}

        System.out.println ();
        System.out.println ("****DOUBLE-DOUBLE****");
        System.out.println ("****TRIPLE-DOUBLE****");
        System.out.println ("*****CALCULATOR******");


    }
}
