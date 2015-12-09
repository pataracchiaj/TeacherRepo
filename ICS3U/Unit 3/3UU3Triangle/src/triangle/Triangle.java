/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package triangle;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author 
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declare variables to sides of a triangle
        int sideOne;
        int sideTwo;
        int sideThree;

        //Create a variable that will collect the user's input
        String userinput;

        //Open up a dialog box to obtain the input from the user
         userinput = JOptionPane.showInputDialog("Welcome to the Triangle program. \nIn a triangle, no one side is greater than the sum of the two other sides. \nThis program determines if three given sides are able to form a triangle.\n\nPlease enter the first side of the triangle: ");

         //Store first side into SideOne
         sideOne = Integer.parseInt (userinput);

         //Open the dialog box to obtain the second side
         userinput = JOptionPane.showInputDialog("Enter the second side of the triangle: ");
         sideTwo = Integer.parseInt (userinput);

         //Open the dialog box to obtain the third side
         userinput = JOptionPane.showInputDialog("Enter the third side of the triangle: ");
         sideThree = Integer.parseInt (userinput);

         //determine if the three given sides are able to make a triangle
	if (sideOne+sideTwo > sideThree && sideTwo+sideThree > sideOne&&sideOne+sideThree > sideTwo) {
		System.out.println("These sides CAN make a triangle.");
	}
	else {
		System.out.println("These sides CAN NOT make a triangle.");
	}
    }

}
