/* Monogram.java
 *
 * Example:
 * input : William Lyon Mackenzie
 * output: wLm
 *
 */
package monogram;

import javax.swing.*;

public class Monogram {

    public static void main(String[] args) {
        //input first name
        String fName = JOptionPane.showInputDialog("What is your first name?");
        //input middle name
        String mName = JOptionPane.showInputDialog("What is your middle name?");
        //input last name
        String lName = JOptionPane.showInputDialog("What is your last name?");

        //Grab 1st char of fName and convert to lower case
        //.charAt returns a char not a String,
        //convert to String by concatenating ""
        String firstInitial = "" + fName.charAt(0);
        firstInitial = firstInitial.toLowerCase();

        String middleInitial = "" + mName.charAt(0);
        middleInitial = middleInitial.toUpperCase();

        String lastInitial = "" + lName.charAt(0);
        lastInitial = lastInitial.toLowerCase();

        System.out.println("Monogram = " + firstInitial + middleInitial + lastInitial);
    }
}
