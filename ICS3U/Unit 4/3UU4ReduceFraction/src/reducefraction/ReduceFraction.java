/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reducefraction;

import java.io.*;

public class ReduceFraction {

    static int numerator, denominator;//stores numerator and denominator
    static int GCM;//stores greatest common multiple

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// user input

        int tryAgain = 1;

        System.out.println("Reduce Fraction");
        System.out.println("===============");
        System.out.println();
        System.out.println("This program will reduce a fraction to its lowest terms.");
        do {
            System.out.println();
            System.out.println("Enter the Numerator:");
            numerator = Integer.parseInt(br.readLine());//user enters numerator
            System.out.println();
            System.out.println("Enter the Denominator:");
            denominator = Integer.parseInt(br.readLine());//user enters denominator
            System.out.println();
            System.out.println("You've entered " + numerator + "/" + denominator);
            GCMFinder(numerator, denominator);//will find the GCM
            System.out.println("GCM: " + GCM);
            System.out.println("Lowest form: " + (numerator / GCM) + "/" + (denominator / GCM));
            System.out.println();
            System.out.println("Press 1 to input a new fraction.");
            tryAgain = Integer.parseInt(br.readLine());//user enters whether or not they want to try again
        } while (tryAgain == 1);
    }//closes main body

    public static void GCMFinder(int numerator, int denominator) {//method that will find the GCM

        for (int i = 1; i <= Math.abs(numerator); i++) {//a loop that will find the GCM

            if ((Math.abs(numerator) % i == 0) && (Math.abs(denominator) % i == 0)) {
                GCM = i;
            }

        }//closes GCM finder for loop

    }//closes GCMFinder method
}
