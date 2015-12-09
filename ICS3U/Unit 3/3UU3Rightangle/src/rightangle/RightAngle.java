/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rightangle;
import javax.swing.*;
import java.io.*;
/**
 *
 * This program determines if the sides given by a user will make a right-angled triangle
 * It accomplishes this using the Pythagorean theorem which applies to all right-angled triangles
 */
public class RightAngle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
        //Declare variables to sides of a triangle
        int sideOne;
        int sideTwo;
        int sideThree;

        //Create a variable that will collect the user's input
        String userinput;

        //Open up a dialog box to obtain the input from the user
         userinput = JOptionPane.showInputDialog("Welcome to the Right Triangle program. \nThe Pythagorean theorem states that in a right-angled triangle, the square of the two smaller \nsides will be equal to the square of the larger side. \nThis program is used to determine if three given sides will be able to form a right-angled triangle.\n\nPlease enter the first side of the triangle: ");

         //Store first side into SideOne
         sideOne = Integer.parseInt (userinput);

         //Open the dialog box to obtain the second side
         userinput = JOptionPane.showInputDialog("Enter the second side of the triangle: ");
         sideTwo = Integer.parseInt (userinput);

         //Open the dialog box to obtain the third side
         userinput = JOptionPane.showInputDialog("Enter the third side of the triangle: ");
         sideThree = Integer.parseInt (userinput);

         //determine if the three given sides are able to make a triangle
	if (sideOne*sideOne+sideTwo*sideTwo == sideThree*sideThree || sideTwo*sideTwo+sideThree*sideThree == sideOne*sideOne || sideOne*sideOne+sideThree*sideThree == sideTwo*sideTwo) {
		System.out.println("These sides CAN make a triangle.");
	}
	else {
		System.out.println("These sides CAN NOT make a triangle.");
	}
    }
    

}
