/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lordofthestrings;

//Student's header would go here


import java.util. Scanner;

public class LordOfTheStrings {

        public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);
                                            //Student's comments would go here

        String usersString;

        System.out.println ("-----------------------------------");
        System.out.println ("--------LORD OF THE STRINGS--------");
        System.out.println ("-----------------------------------");
        System.out.println ();

        System.out.print ("Enter a string that contains at least 6 characters: ");
        usersString = keyedInput.next();
        System.out.println ();

        System.out.print ("Number of characters in the string: " );
        System.out.println (usersString.length());
        
        System.out.print ("The substring using character 4 to 6 is: " );
        System.out.println (usersString.substring(3,6));
       
        System.out.print ("The substring starting at character 2 is: ");
        System.out.println (usersString.substring(1)); 
        
        System.out.print ("The first time an 'a' is found is at spot: ");
        System.out.println (usersString.indexOf ("a")+1);
    
        System.out.print ("The last time an 'a' is found is at spot: ");
        System.out.println (usersString.lastIndexOf ("a")+1);     

        System.out.print ("The character at spot 4 is: ");
        System.out.println (usersString.charAt (3));

        System.out.println ();
        System.out.println ("-----------------------------------");
        System.out.println ("--------LORD OF THE STRINGS--------");
        System.out.println ("-----------------------------------");
    }

}
