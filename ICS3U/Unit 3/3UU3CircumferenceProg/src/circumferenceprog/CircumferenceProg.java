/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package circumferenceprog;

/**
 * @author ICS3U
 */
import java.io.*;
import java.text.*; //need for DecimalFormat class
import javax.swing.*; //required for the Inputbox

public class CircumferenceProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
       //Initialize the Input stream reader
        BufferedReader myInput = new BufferedReader
                (new InputStreamReader (System.in));

        //Declare our variables
        double PI = 3.14159;
        double radius;
        double area;
        double circumference;

       //Initalize the formatting to 2 decimal places
        DecimalFormat twoDigit = new DecimalFormat ("#,##0.00");

        //Ask and Obtain Radius from the user as a String and convert to a double

        String radinput = JOptionPane.showInputDialog("Please enter the radius of a circle: ");

        //System.out.println ("Please enter the radius of the circle: ");
        radius = Double.parseDouble (radinput);

        //Calculate the area of a circle
        area = PI * radius * radius;

        //Calculate the circumference of a circle
        circumference = 2 * PI * radius;

        //Output values to the user
        System.out.println ("The area of a circle is: " + twoDigit.format (area));
        System.out.println ("The circumference of a circle is: " + twoDigit.format (circumference));

    }

}
