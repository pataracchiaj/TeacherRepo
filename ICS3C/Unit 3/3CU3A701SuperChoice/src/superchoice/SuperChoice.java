/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package superchoice;


import java.util. Scanner;

public class SuperChoice {

        public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);

        int choice, firstNum, secondNum, answer;

        System.out.println ("-------SUPER-------");
        System.out.println ("-------CHOICE------");
        System.out.println ("------PROGRAM------");
        System.out.println ();

        System.out.println ("You may select one of the following options:" );
        System.out.println ("1... Add to numbers" );
        System.out.println ("2... Double up a number a given number of times" );
        System.out.println ("3... Determine the factorial of a given  number");
        System.out.print ("Enter your choice: ");
        choice = keyedInput.nextInt();
        System.out.println ();

 if (choice ==1)
        {System.out.print ("Enter the first number: ");
        firstNum = keyedInput.nextInt();
        System.out.print ("Enter the second number: ");
        secondNum = keyedInput.nextInt();
        answer = firstNum + secondNum;
        System.out.println ();
        System.out.println ("The number " + firstNum + " added to " + secondNum + " equals: " + answer);
        }
 else if (choice ==2)
        {
        System.out.print ("Enter the number you would like to double: ");
        firstNum = keyedInput.nextInt();
        System.out.print ("Enter the number of times you would like to double it: ");
        secondNum = keyedInput.nextInt();
        answer = firstNum;
        for (int i=1; i<= secondNum; i++)
        {answer = answer * 2;}
         System.out.println ();
        System.out.println ("The number " + firstNum + " doubled " + secondNum + " times equals: " + answer);
        }
 else if (choice ==3)
        {
        System.out.print ("Enter the number for which you would like to determine the factorial: ");
        firstNum = keyedInput.nextInt();
        answer = 1;
        for (int i=1; i<= firstNum; i++)
        {answer = answer * i;}
        System.out.println ();
        System.out.println ("The factorial of the number " + firstNum + " is " + answer);
        }
 else
        {System.out.println ("Sorry, that choice is invalid");}

        System.out.println ();
        System.out.println ("-------SUPER-------");
        System.out.println ("-------CHOICE------");
        System.out.println ("------PROGRAM------");

    }

}
