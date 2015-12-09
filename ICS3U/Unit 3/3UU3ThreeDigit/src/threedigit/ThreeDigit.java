/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threedigit;
import java.io.*;
import javax.swing.*; //required for the Inputbox
/**
 *
 * @author JT
 */
public class ThreeDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hundreds, tens, ones, sum;
        String result;


        //Using the Input Dialogbox to obtain the three digits
        String numdigit = JOptionPane.showInputDialog("Welcome to the Three Digit Sum Calculator.\nEnter a three digit number: ");

        //Convert String to Integer
        int number = Integer.parseInt(numdigit);

        //Calculate the numbers for each digit
        hundreds = number / 100;
        tens = (number / 10) - 10 * hundreds;
        ones = number - (100*hundreds)-(10*tens);

        //Add all the digits together
        sum = hundreds + tens+ ones;

       //Display the answer on the screen
        System.out.println ("The answer is: " + sum);

        //Answer using an output dialogbox
        result = ("The answer is:" + sum);
        JOptionPane.showMessageDialog(null,result);
        }

  }
