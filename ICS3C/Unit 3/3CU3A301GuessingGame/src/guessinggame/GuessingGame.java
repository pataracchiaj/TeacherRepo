
package guessinggame;


import java.util. Scanner;

public class GuessingGame {

        public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);

        double value, guess;

        value = Math.round(Math.random()*9+1);
        
        System.out.println ("---RANDOM NUMBER GUESSING GAME---");
        System.out.println ();
 
        System.out.print ("Enter your guess: ");
        guess = keyedInput.nextDouble();

        if (guess == value)
        {System.out.println ("Correct Guess!");}
        else
        {System.out.println ("Incorrect Guess!");}

        System.out.println ();
        System.out.println ("---RANDOM NUMBER GUESSING GAME---");

        }

}
