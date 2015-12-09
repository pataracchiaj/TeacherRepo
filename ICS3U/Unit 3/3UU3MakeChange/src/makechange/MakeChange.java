/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package makechange;
import java.io.*;
import javax.swing.*; //required for the Inputbox
/**
 *
 * @author JT
 */
public class MakeChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));


	//Variable declaration
	double amountin;
	int numoftoonies, remoftoonies, numofloonies, remofloonies, numofquarters, remofquarters, numofdimes, remofdimes, numofnickels, remofnickels, numofpennies, remofpennies;

	//Welcome screen and amount input Using Input Dialog Box
        String coinstype = JOptionPane.showInputDialog("Hello and welcome to the MakeChange Machine.\nPlease enter the amount in with a decimal.");
	
        /*Answer Using InputStreamReader
        System.out.println ("Hello and welcome to the MakeChange Machine.");
	System.out.println ();
	System.out.println ();
	System.out.println ("Please enter the amount in dollars.");

        amountin = Double.parseDouble (br.readLine());
         */
        
        //Answer using Input Dialog Box
        amountin = Double.parseDouble (coinstype);

	//Changes the input amount to a whole number
	amountin = amountin * 100;
	//Type casting changes the variable amountin from a double to an int
	int coinsin = (int) amountin;
	//Calculates the amount of change
	numoftoonies = coinsin/200;
	remoftoonies = coinsin%200;
	numofloonies = remoftoonies/100;
	remofloonies = remoftoonies%100;
	numofquarters = remofloonies/25;
	remofquarters = remofloonies%25;
	numofdimes = remofquarters/10;
	remofdimes = remofquarters%10;
	numofnickels = remofdimes/5;
	remofnickels = remofdimes%5;
	numofpennies = remofnickels/1;
	remofpennies = remofnickels%1;

	//Displays the amounts calculated.
	System.out.println ();
	System.out.println ();
	System.out.println ("There are:");
	System.out.println (numoftoonies + " toonies");
	System.out.println (numofloonies + " loonies");
	System.out.println (numofquarters + " quarters");
	System.out.println (numofdimes + " dimes");
	System.out.println (numofnickels + " nickels");
	System.out.println (numofpennies + " pennies");
    }

}
