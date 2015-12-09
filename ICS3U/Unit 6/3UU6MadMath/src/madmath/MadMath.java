/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package madmath;
import java.io.*;

/**
 *
 * @author James
 */
public class MadMath 
{
    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
  // user input

    public static void main (String args[]) throws IOException
    {

        int menuChoice = 0; //will store the user's choice in the menu


        int prevScore [] = new int [10];//stores 10 score values
        String prevScoreName [] = new String [10];//stores 10 associated names

        for(int i = 0; i<10; i++)//populates the previous score arrays
        {
            prevScore[i] = 0;
            prevScoreName[i] = "John Doe";
        }

        System.out.println ("~MAD MATH~");
        System.out.println ("==========");
        System.out.println ("Welcome to MAD MATH!");

        do
        {

            System.out.println ();
            System.out.println ("1 == Play");
            System.out.println ("2 == Instructions");
            System.out.println ("3 == Previous Scores");
            System.out.println ("4 == Exit Game");

            menuChoice = Integer.parseInt (br.readLine ()); //user chooses their option
            System.out.println ();

            if (menuChoice == 1)
            {
               int points = startGame ();//gets the points scored after the user plays
               String newName = endGame(points);//gets the user's name
               prevScore = scoreChange(prevScore, points);//swaps the points of the previous score list
               prevScoreName = nameChange(prevScoreName, newName);//swaps the names of the previous score list
            }
            else if (menuChoice == 2)
            {
                printInstructions (); //a method that will print the instructions of how to play

            }
            else if (menuChoice == 3)
            {
                printScores (prevScore, prevScoreName); //a method which prints high scores

            }
            else if (menuChoice != 4)
            {
                System.out.println ("Invalid Entry! Try again.");
            }

        }
        while (menuChoice != 4);

        System.exit (0); //ends the game

    } //main method


    public static int startGame () throws IOException //a method that initializes a new game
    {
        int lives = 3; //sets the number of lives to 3
        int points = 0; // sets the user's points to zero
        int correct, userAnswer;//will store the correct answer and the user's answer

        System.out.println ("Good Luck!");
        System.out.println ("==========");
        System.out.println ();

        do{
            System.out.println ("Points: " + points);
            System.out.println ("Lives: " + lives);
            System.out.println ("============");
            System.out.println ();
            correct = displayNewQuestion (); //calls this method to display a new question
            userAnswer = Integer.parseInt(br.readLine());//user will answer the question
            System.out.println();

            if(userAnswer==correct)//if the user's answer is the same as the correct answer
            {
                points++;//add a point
                System.out.println("CORRECT! You've scored a point!");
            } else
            {
                lives--;//take away a life
                System.out.println("INCORRECT! You've lost a life.");
            }
            System.out.println ();
          }while (lives!=0);//will keep repeating for as long as the user has lives

          return (points);//returns the points to main method
    }//closes the startGame method

    public static String endGame (int points) throws IOException // a method that tells the user the game is over
    {
        System.out.println("GAME OVER!");
        System.out.println();
        System.out.println("You got "+points+" questions correct.");
        System.out.println();
        System.out.println("Enter your name for the previous score list:");

        String newName = br.readLine();//user enters their name

        return(newName);

    }//endGame method

    public static int[] scoreChange (int prevScore [], int points)
    {
        int temp;//will hold a temporary position

        for(int i = 9; i>0; i--)//for loop that shifts scores down
        {
            temp = prevScore[i-1];//store a temp
            prevScore[i-1]=prevScore[i];//shifts the score
            prevScore[i] = temp;//set the next position to the temp
        }
        prevScore[0]=points;//enters the new score in the first slot
        return (prevScore);
    }

    public static String[] nameChange (String prevScoreName [], String newName)
    {
        String temp;//will hold a temporary position

        for(int i = 9; i>0; i--)//for loop that shifts names down
        {
            temp = prevScoreName[i-1];//store a temp
            prevScoreName[i-1]=prevScoreName[i];//shifts the name
            prevScoreName[i] = temp; //set the next position to the temp
        }

        prevScoreName[0]=newName;//enters the new name in the first slot
        return (prevScoreName);
    }

    public static void printInstructions ()  //a method that will print the instructions to the user
    {
        System.out.println ("MAD MATH ~ Instructions");
        System.out.println ("=====================");
        System.out.println ("-You have 3 lives.");
        System.out.println ("-You will be given a math question.");
        System.out.println ("-Answer correctly to score a point.");
        System.out.println ("-Answer incorrectly, and you lose a life.");
        System.out.println ("-When dividing, round DOWN to the nearest ONE.");
        System.out.println ("-Use your MAD MATH skills to get yourself on the leaderboard!");
    } //printInstructions method


    public static void printScores (int highScore[], String highScoreName[])//a method that prints high scores
    {
        System.out.println("Previous Scores");
        System.out.println("===============");

        for(int i = 0; i<10; i++)
        {
            System.out.println(highScoreName[i] + " - " + highScore[i]);
        }

    }//highScore method


    public static int displayNewQuestion ()  // a method that displays a random arithmetic question
    {
        int num1, num2, operator; // stores the numbers and operator for the questions
        int correctAnswer=0; //stores the correct answer

        num1 = randomWholeNumber (12, -12); //calls the randomWholeNumber and passes a 1 to indicate a number from -12 to 12
        num2 = randomWholeNumber (12, -12); //calls the randomWholeNumber and passes a 1 to indicate a number from -12 to 12
        operator = randomWholeNumber (4, 1); //calls the randomWholeNumber and passes a 2 to indicate a number from 1 to 4

        if (operator == 1)//addition question
        {
            System.out.println ("("+num1 + ") + (" + num2 + ") = ?");
            correctAnswer = num1 + num2; //calculates the correct answer
        }
        if (operator == 2)//subtraction question
        {
            System.out.println ("("+num1 + ") - (" + num2 + ") = ?");
            correctAnswer = num1 - num2; //calculates the correct answer
        }
        if (operator == 3)//multiplication question
        {
            System.out.println ("("+num1 + ") x (" + num2 + ") = ?");
            correctAnswer = num1 * num2; // calculates the correct answer
        }
        if (operator == 4)//division question
        {
            do{
                num2 = randomWholeNumber (12, -12);
              }while(num2==0);// if the divisor is zero, a new number will be assigned. (divisor can't be 0)

            System.out.println ("("+num1 + ") / (" + num2 + ") = ?");
            correctAnswer = (int) Math.floor (num1 / num2); // calculates the correct answer
        }
        return (correctAnswer); //returns the correct answer
    }//closes the displayNewQuestion method

    public static int randomWholeNumber (int u, int l) //a method that makes a random number betwen the upper and lower ranges
    {
        int randNum = (int) Math.floor ((u - l + 1) * Math.random () + l); //generates a random number between the lower and upper
        return randNum; //returns the random number to the main method
    }

}

