/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromefinder;

import java.util.Scanner;

public class ICS3CU4A6PalindromeFinder6 {

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
        // remove apostrophes (')
        userPhrase = removeChar(userPhrase, '\'');
        // remove commas (,)
        userPhrase = removeChar(userPhrase, ',');
        // remove periods (.)
        userPhrase = removeChar(userPhrase, '.');
        // remove exclamation marks (!)
        userPhrase = removeChar(userPhrase, '!');
        // remove question marks (?)
        userPhrase = removeChar(userPhrase, '?');
        // remove double quotes (")
        userPhrase = removeChar(userPhrase, '"');
        // remove semi-colons (;)
        userPhrase = removeChar(userPhrase, ';');
        // remove colons (:)
        userPhrase = removeChar(userPhrase, ':');
        // remove dashes (-)
        userPhrase = removeChar(userPhrase, '-');
System.out.println("Punctuation successfully removed. Removing spaces...");
// Step 2: Remove all spaces from the phrase
        // remove spaces
        userPhrase = removeChar(userPhrase, ' ');

// Step 3: Convert the phrase to lowercase
        userPhrase = userPhrase.toLowerCase();
// Step 4: Check to see if the phase is a palindrome and output result

        if (isAPalidrome(userPhrase)) {
            System.out.println("The string " + userPhrase + " is a palindrome!");
        } else {
            System.out.println("The string " + userPhrase + " is not a palindrome!");
        }

        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("-------PALINDROME FINDER-------");
        System.out.println("-------------------------------");
    }

    private static String removeChar(String str, char c) {

        int pos = str.indexOf(c);
        while (pos >= 0) {
            str = str.substring(0, pos) + str.substring(pos + 1);
            pos = str.indexOf(c);
        }
        return str;
    }

    private static boolean isAPalidrome(String str) {
        String backwards;
        int len = str.length();
        backwards = "";
        //reverse the string
        for (int i = 1; i <= len; i++) {
            backwards = backwards + str.charAt(len - i);
        }

//        for (int i = str.length() - 1; i >= 0; i--) {
  //          backwards = backwards + str.charAt(i);
//       }
        
        // If str and backwards are the same, then it is a palindrome (return true).
        // Otherwise return false.
        
        if (backwards.equals(str)) {
            return (true);
        } else {
            return (false);
        }
    }
}
