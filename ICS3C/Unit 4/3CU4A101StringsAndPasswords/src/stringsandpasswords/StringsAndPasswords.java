/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stringsandpasswords;

import java.util. Scanner;

public class StringsAndPasswords {

    public static void capFirstLetter (String userString)
           {
             String firstLetter;

             firstLetter = userString.substring (0, 1);
             System.out.print ("The first letter of the string has been capitalized: ");
             System.out.println (firstLetter.toUpperCase() + userString.substring (1));
            }

        public static void  capLastLetter (String userString)
            {
             String lastLetter;

             lastLetter = userString.substring (userString.length()-1,userString.length());
             System.out.print ("The last letter of the string has been capitalized: ");
             System.out.println (userString.substring (0, userString.length()-1) + lastLetter.toUpperCase());
            }

        public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);

        final String realPass = "letmein";
        String pWord, usersInput;
        int times, choice;

        times = 0;
       
        while (times <3)
        {
        System.out.print ("Please enter the program password (must be between 6 and 12 characters long): ");
        pWord = keyedInput.next();

            if ( pWord.length () < 6 | pWord.length () >12 )
                {
                    System.out.println ("Sorry, your password was not between 6 and 12 characters.");
                    System.out.println ();
                    times = times + 1;
                }
            else if (pWord.equals(realPass))
                {
                    System.out.println ();
                    System.out.println ("Welcome to the program.");
                    System.out.print ("Please enter a string: ");
                    usersInput= keyedInput.next();
                    System.out.println ();

                    System.out.println ("Here are your options:");
                    System.out.println ("   1... Convert the first letter to upper case");
                    System.out.println ("   2... Convert the last letter to upper case");
                    System.out.print ("   Please enter your choice: ");
                    choice= keyedInput.nextInt();
                    System.out.println ();
                    
                    if (choice == 1)
                    {
                    capFirstLetter (usersInput);
                    }
                    else if(choice == 2)
                    {
                    capLastLetter (usersInput);
                    } 
               break;
                }
            else
                {
                    System.out.println ("Sorry, you have inputted a password that is incorrect.");
                    System.out.println ();
                    times = times + 1;
                }
        }

        if (times ==3)
        {
        System.out.println ("Sorry, you have tried 3 times. You will now be locked out.");
        }
    }

}
