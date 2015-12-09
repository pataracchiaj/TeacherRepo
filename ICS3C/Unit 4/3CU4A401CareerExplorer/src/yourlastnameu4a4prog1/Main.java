/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package yourlastnameu4a4prog1;

//student's header would go here

import java.util. Scanner;

public class Main {

        public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);       //student's comments would go here

        String pWord, uName;

        final String teacherUName = "teacher";
        final String teacherPWord = "lovetoteach";
        final String studentUName = "student";
        final String studentPWord = "lovetolearn";

        int times = 0;

        System.out.println ("*********************");
        System.out.println ("***CAREER EXPLORER***");
        System.out.println ("*********************");
        System.out.println ();

        System.out.println ("Welcome to the career explorer program.");
        System.out.println ("Please enter you username and password.");
        System.out.println ();

        while (times <3)
        {
        System.out.print ("Username (must be between 6 and 12 characters long): ");
        uName = keyedInput.next();
        System.out.print ("Password (must be between 6 and 12 characters long): ");
        pWord = keyedInput.next();
        
            if (uName.length () < 6 | uName.length () >12 | pWord.length () < 6 | pWord.length () >12 )
                {
                    System.out.println ("Sorry, either your username or password was not between 6 and 12 characters.");
                    System.out.println ();
                    times = times + 1;
                }
            else if (uName.equals(teacherUName) & pWord.equals(teacherPWord))
                {
                    System.out.println ("Welcome teacher, to the career explorer software!");
                    break;
                }
            else if (uName.equals(studentUName) & pWord.equals(studentPWord))
                {
                    System.out.println ("Welcome student, to the career explorer software!");
                    break;
                }
            else
                {
                    System.out.println ("Sorry, you have inputted a username or password that is incorrect.");
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

