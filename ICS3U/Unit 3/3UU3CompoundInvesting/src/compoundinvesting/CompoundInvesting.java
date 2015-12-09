/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package compoundinvesting;
import javax.swing.*;
import java.io.*;
import java.text.*; //need for DecimalFormat class
/**
 *
 * @author 
 */
public class CompoundInvesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Declare our variables
        int years;
        double amount, interest, interestShown, amountInAccount, total;
        //Set Total to 0
        total = 0;

        //formats to 2 decimal places
        DecimalFormat twoDigit = new DecimalFormat ("#,##0.00"); 
        
        //Obtain values from the user and store them to the appropriate variables.
        String myinput = JOptionPane.showInputDialog("Welcome to the Compound Interest Calculator. /n This program will print out a titled table \nthat will display the amount of yearly investment over a period of up to 15 years.\n\nEnter the Yearly Investment Amount ($):");
        //store input as a double.
       amount = Double.parseDouble(myinput);
       //Obtain the Interest rate
       myinput = JOptionPane.showInputDialog("Please input the interest rate in percent (%):");
       //store interest as a double
       interest = Double.parseDouble(myinput);
       //Obtain the number of years
       myinput = JOptionPane.showInputDialog("Please enter the number of years for this investment: ");
       years = Integer.parseInt(myinput);

       //Output
       System.out.println("\t\tCompound Interest Calculator");
       System.out.println("Year\tAmount in Account\tInterest\t   Total");

       //Output and calculate for each year in a loop
        for(int i=1; i<=years; i++){
    amountInAccount=amount+total;//calculates amount in account
    interestShown = ((interest/100)*amountInAccount);//calculates interest
    total = amountInAccount+interestShown; // calculates total

if (i<=9){
    System.out.print(" "+i+"\t\t");//prints year
    System.out.print(twoDigit.format (amountInAccount)+"\t\t");//prints amount in account
    
    //Nested Loop so that interestShown aligns properly
    if (interestShown <=9.99)
    {
        System.out.print(" "+twoDigit.format (interestShown)+"\t");//prints interest
    }
    else
    {
       System.out.print(twoDigit.format (interestShown)+"\t");//prints interest 
    }

    //Nested Loop so that the Total aligns properly
    if (total <=999.99)
    {
        System.out.print("  "+ twoDigit.format (total));//prints total
    }
    else
    {
        System.out.print(twoDigit.format (total));//prints total
    }
    
    System.out.println();
}
 else{
    System.out.print(i+"\t      ");//prints year
    System.out.print(twoDigit.format (amountInAccount)+"\t\t");//prints amount in account
    System.out.print(twoDigit.format (interestShown)+"\t");//prints interest
    System.out.print(twoDigit.format (total));//prints total
    System.out.println();
 }
    
        }
       

    }

}
