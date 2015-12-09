/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromefinder;

import java.util.Scanner;

public class ICS3CU4A6PalindromeFinder3c {

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
        
// Step 2: Remove all spaces from the phrase
        // remove spaces
        userPhrase = removeChar(userPhrase, ' ');

// Step 3: Convert the phrase to lowercase

// Step 4: Check to see if the phase is a palindrome and output result

    }

    private static String removeChar(String str, char c) {

        int pos = str.indexOf(c);
        while (pos >= 0) {
            str = str.substring(0, pos) + str.substring(pos + 1);
            pos = str.indexOf(c);
        }
        return str;
    }
}
