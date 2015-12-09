/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package yourlastnameu4a2prog1;

//student's header goes here

import java.util. Scanner;

public class Main {

        public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);

        String usersString;     //student's comments go here

        System.out.println ("**********BEST***********");
        System.out.println ("**********CASE***********");
        System.out.println ("********SCENARIO*********");
        System.out.println ();

        System.out.print ("Enter a string that contains both uppercase and lowercase letters: ");
        usersString = keyedInput.next();
        System.out.println ();
        
        System.out.print ("That string has been formatted to all upper case letters: ");
        System.out.println (usersString.toUpperCase());
   
        System.out.print ("That string has been formatted to all lower case letters: ");
        System.out.println (usersString.toLowerCase());
        System.out.println ();
               
        System.out.println ("**********BEST***********");
        System.out.println ("**********CASE***********");
        System.out.println ("********SCENARIO*********");

    }

}
