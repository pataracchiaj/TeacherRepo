/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package canadadebt;
import java.io.*;
import java.text.*; //need for DecimalFormat class

/**
 *
 * @author Canada's Debt Burden Solution
 * You can copy and paste this directly into Netbeans if you save the project
 * as canadadebt.
 */
public class CanadaDebt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Assigning variables
	double originalDebt = 481.5;
        
        //Format to one decimal place
        DecimalFormat oneDigit = new DecimalFormat ("#,##0.0");

	//Introduction
	System.out.println ("Canada's debt burden in 2007 was $481.5 billion dollars.");
	System.out.println ("However, the Canadian government hopes to reduce this debt by 3% per year");
	System.out.println ();

	//Calculating new debt burdens over the years
	//2008
	double yearlyReduction = 0.03;
	double Debt08 = originalDebt * (1 - yearlyReduction);

	System.out.println ("This means that the debt burden in 2008 will be $" + oneDigit.format(Debt08) + " billion dollars.");

	//2009
	double Debt09 = Debt08 * (1 - yearlyReduction);
	System.out.println ("The debt burden would further reduce to $" + oneDigit.format(Debt09) + " billion dollars in 2009.");

	//2010
	double Debt10 = Debt09 * (1 - yearlyReduction);
	System.out.println ("Again the debt burden would reduce in 2010 to become $" + oneDigit.format(Debt10) + " billion dollars.");
    }

}
