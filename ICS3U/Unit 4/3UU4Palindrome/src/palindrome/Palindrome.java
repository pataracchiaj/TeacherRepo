package palindrome;

import javax.swing.*;

public class Palindrome {

    public static void main(String[] args) {
        String word, backwardsWord;
        int pos;

        //get the word from the user
        word = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a words is a palindrome.\n\n"
                + "Enter a word:");

        //Reverse the word
        backwardsWord = "";
        for (pos = word.length() - 1; pos >= 0; pos--) {
            backwardsWord += word.charAt(pos);
        }

        //Compare the words
        if (word.equalsIgnoreCase(backwardsWord)) {
            JOptionPane.showMessageDialog(null, word + " in reverse is " + backwardsWord
                    + ".\nIt IS a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, word + " in reverse is " + backwardsWord
                    + ".\nIt IS NOT a palindrome.");
        }
    }
}
