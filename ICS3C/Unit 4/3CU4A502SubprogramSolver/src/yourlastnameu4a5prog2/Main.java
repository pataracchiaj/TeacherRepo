/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package yourlastnameu4a5prog2;

import java.util. Scanner;

public class Main {

     public static double subThem (double num1, double  num2)
    {double answer;
     answer = num1 - num2;
     return (answer);
    }

      public static double multThem (double num1, double num2)
    {double answer;
     answer = num1 * num2;
     return (answer);
    }

       public static double divThem (double num1, double num2)
    {double answer;
     answer = num1 / num2;
     return (answer);
    }
      public static void main(String[] args) {

      Scanner keyedInput = new Scanner(System.in);

      double value1, value2;
      int choice;

      System.out.println ("***********************");
      System.out.println ("***SUBPROGRAM SOLVER***");
      System.out.println ("***********************");
      System.out.println ("");

      System.out.print ("Please enter the first number: ");
      value1 = keyedInput.nextInt();
      System.out.print ("Please enter the second number: ");
      value2 = keyedInput.nextInt();
      System.out.println ("");

      System.out.println ("Here are your options:");
      System.out.println ("   1... Subtract the two numbers");
      System.out.println ("   2... Multiply the two numbers");
      System.out.println ("   3... Divide the two numbers");
      System.out.print ("Please enter your choice: ");
      choice = keyedInput.nextInt();
      System.out.println ("");

      if (choice == 1)
      {
          System.out.println("The numbers have been subtracted.");
          System.out.println ("The result is: "+ subThem(value1, value2));}
      else if (choice == 2)
      {
          System.out.println("That numbers have been multiplied.");
          System.out.println ("The result is: "+ multThem(value1, value2));}
      else if (choice == 3)
      {
          System.out.println("That number has been quadrupled.");
          System.out.println ("The result is: "+ divThem(value1, value2));}
      else
      {   System.out.println("Sorry, that was an invalid choice");}

          System.out.println ("");
          System.out.println ("***********************");
          System.out.println ("***SUBPROGRAM SOLVER***");
          System.out.println ("***********************");
}
}