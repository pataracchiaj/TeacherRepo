/*
 * ICS 3U Unit 4 Activity ___ Guess Number 
 */

package guessnumber;

import java.io.*;

public class GuessNumber {

 //      static int lowVal, highVal;//user will input a range of values to generate a random number
//    static int randNum;//stores the randomly generated number

 public static void main (String args []) throws IOException
 {
  BufferedReader br = new BufferedReader (new InputStreamReader (System.in));// user input

    int tryAgain=1;//initializes first do-while loop
    int guess;//stores user's guess
 
    System.out.println("Guess the Number");
    System.out.println("================");
    System.out.println();
    System.out.println("In this game, you will set a range of numbers and the computer");
    System.out.println("will randomly generate a number between these numbers. Then you");
    System.out.println("will try to guess the number.");

    do{

    System.out.println();
    System.out.println("Input the low value of your range:");
    int lowVal = Integer.parseInt(br.readLine());//user inputs the low value of the range
    System.out.println();
    System.out.println("Input the high value of your range:");
    int highVal = Integer.parseInt(br.readLine());//user inputs the high value of the range
    System.out.println();

    int randNum=randomWholeNumber(lowVal, highVal);//generates a random number between the two ranges
    System.out.println();
    System.out.println("The computer has generated a random number between "+lowVal+" and "+highVal+".");
    System.out.println();

    int guessNum=0;//will count the number of guesses made

    do{
    guessNum=guessNum+1;//will add 1 to the number of guesses made
    System.out.println("Guess #"+guessNum);
    System.out.println("===========");
    System.out.println("Input your guess:");
    guess=Integer.parseInt(br.readLine());//user makes a guess here
    System.out.println();
    clue(guess, randNum);//if user gets the number wrong, it will print a clue in this method
    System.out.println();
    }while(guess!=randNum);//will repeat if the user gets the number wrong

    System.out.println("After guess #"+guessNum+", you got the number right!");
    System.out.println("Press 1 to try again.");
    tryAgain=Integer.parseInt(br.readLine());//user inputs choice
    }while(tryAgain==1);//will repeat if user chooses to try again

 }//closes main body

    public static int randomWholeNumber(int lVal, int hVal){ //a method that will generate a random number between the given range
     int rNum=(int) ((Math.random()*(hVal-lVal))+lVal);//generates and returns a random number within user's range
     return (rNum);
    }//closes randomWholeNumber method

    public static void clue (int guess, int rNum){//will print a clue for the user

    if(guess<rNum){//if user guesses too low
    System.out.println("You have guessed TOO LOW");}

    if(guess>rNum){//if user guesses too high
    System.out.println("You have guessed TOO HIGH");}

    }//closes clue method

}
