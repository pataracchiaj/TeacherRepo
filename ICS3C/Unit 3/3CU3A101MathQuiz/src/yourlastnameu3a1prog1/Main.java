/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package yourlastnameu3a1prog1;

import java.util.Scanner;

public class Main {

    //student's program header would go here
    
    public static void main(String[] args) {

Scanner keyedInput = new Scanner (System.in);

            final int ANSWER = 9;               //student's comments would go here
            int guess;

            System.out.println ("DO YOU HAVE BAD MATH SKILLS, OR MAD MATH SKILLS?");
            System.out.println ();

            System.out.print ("What is 2 + 7? ");
            guess = keyedInput.nextInt();
            System.out.println ();

            if (guess == ANSWER )
            {System.out.println ("Well done, you have mad math skills!");}
            else
            {System.out.println ("Sorry, you have bad math skills!");}
    
    }
}
