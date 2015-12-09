/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package canyouadd;

import java.util.Scanner;

public class CanYouAdd {

   //student's header would appear here

    public static void main(String[] args) {
      
        Scanner keyedInput = new Scanner (System.in);
        
        final int ANSWER1 = 48;
        final int ANSWER2 = 47;
        final int ANSWER3 = 43;
        int guess1, guess2, guess3;       //student's comments would appear here

            System.out.println ("CAN YOU CALCULATE?");
            System.out.println ();

            System.out.print ("What does 23 + 25 equal? ");
            guess1 = keyedInput.nextInt();
            System.out.println ();

            System.out.print ("What does 45 + 2 equal? ");
            guess2 = keyedInput.nextInt();
            System.out.println ();

            System.out.print ("What does 33 + 10 equal? ");
            guess3 = keyedInput.nextInt();
            System.out.println ();

            if (guess1 == ANSWER1 & guess2==ANSWER2 & guess3 ==ANSWER3)
            {System.out.println ("You completed three calculations correctly!");}

            else if (guess1 != ANSWER1 & guess2==ANSWER2 & guess3 ==ANSWER3)
            {System.out.println ("You completed two calculations correctly!");}
            else if (guess1 == ANSWER1 & guess2!=ANSWER2 & guess3 ==ANSWER3)
            {System.out.println ("You completed two calculations correctly!");}
            else if (guess1 == ANSWER1 & guess2==ANSWER2 & guess3 !=ANSWER3)
            {System.out.println ("You completed two calculations correctly!");}

            else if (guess1 != ANSWER1 & guess2!=ANSWER2 & guess3 ==ANSWER3)
            {System.out.println ("You completed one calculation correctly!");}
            else if (guess1 == ANSWER1 & guess2!=ANSWER2 & guess3 !=ANSWER3)
            {System.out.println ("You completed one calculation correctly!");}
            else if (guess1 != ANSWER1 & guess2==ANSWER2 & guess3 !=ANSWER3)
            {System.out.println ("You completed one calculation correctly!");}

            else
            {System.out.println ("You completed zero calculations correctly!");}

            

    }

}
