/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */




package yourlastnameu4a5prog1;


import java.util. Scanner;



public class Main {

     public static int doubleThem (int num1)
    {
            num1 = num1 * 2;
            return (num1);
    }

      public static int tripleThem (int num1)
    {
            num1 = num1 * 3;
            return (num1);
    }

       public static int quadrupleThem (int num1)
    {
            num1 = num1 * 4;
            return (num1);
    }


        public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);

      int initialValue, choice;

      System.out.println ("***********************");
      System.out.println ("***CLASSY CALCULATOR***");
      System.out.println ("***********************");
      System.out.println ("");

      System.out.print ("Enter a number: ");
      initialValue = keyedInput.nextInt();
      System.out.println ("");

      System.out.println ("Here are your options:");
      System.out.println ("   1... Double the number");
      System.out.println ("   2... Triple the number");
      System.out.println ("   3... Quadruple the number");
      System.out.print ("Please enter your choice: ");
      choice = keyedInput.nextInt();
System.out.println ("");
      if (choice == 1)
      {
          System.out.println("That number has been doubled.");
          System.out.println ("The result is: "+ doubleThem(initialValue));}
      else if (choice == 2)
      {
          System.out.println("That number has been tripled.");
          System.out.println ("The result is: "+ tripleThem(initialValue));}
      else if (choice == 3)
      {
          System.out.println("That number has been quadrupled.");
          System.out.println ("The result is: "+ quadrupleThem(initialValue));}

        else
    {System.out.println("Sorry, that was an invalid choice");}
  System.out.println ("");
       System.out.println ("***********************");
      System.out.println ("***CLASSY CALCULATOR***");
      System.out.println ("***********************");


}
}

