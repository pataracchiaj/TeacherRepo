/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromefinder;

import java.util.Scanner;

public class ICS3CU4A6PalindromeFinder3a {

    public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);

        String userPhrase;

        System.out.println("-------------------------------");
        System.out.println("-------PALINDROME FINDER-------");
        System.out.println("-------------------------------");
        System.out.println("");

        System.out.println("Please enter a string and I");
        System.out.print("will determine whether or not it's a palindrome: ");
// Get a line from the user
        userPhrase = keyedInput.nextLine();
// Step 1: Remove all punctuation from the phrase
// remove apostrophes
        char ltr = '\'';
        int pos = userPhrase.indexOf(ltr);
        while (pos >= 0) {
            userPhrase = userPhrase.substring(0, pos) + userPhrase.substring(pos + 1);
            pos = userPhrase.indexOf(ltr);
        }
        // remove commas
        ltr = ',';
        pos = userPhrase.indexOf(ltr);
        while (pos >= 0) {
            userPhrase = userPhrase.substring(0, pos) + userPhrase.substring(pos + 1);
            pos = userPhrase.indexOf(ltr);
        }        
        // remove periods (.)
        // remove exclamation marks (!)
        // remove question marks (?)
        // remove double quotes (")

        
// Step 2: Remove all spaces from the phrase
        // remove commas
        ltr = ' ';
        pos = userPhrase.indexOf(ltr);
        while (pos >= 0) {
            userPhrase = userPhrase.substring(0, pos) + userPhrase.substring(pos + 1);
            pos = userPhrase.indexOf(ltr);
        }        
// Step 3: Convert the phrase to lowercase
         
// Step 4: Check to see if the phase is a palindrome and output result
 
    }
   
}
