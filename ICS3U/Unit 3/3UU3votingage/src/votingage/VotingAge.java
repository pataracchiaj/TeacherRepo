/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package votingage;
import javax.swing.*;

public class VotingAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Declare variables
        String voteage;

         //Get the users voting age
        voteage = JOptionPane.showInputDialog("Enter your age: ");

        //Convert a String to an Integer datatype and store into age
        int age = Integer.parseInt(voteage);

        //Make a decision to determine if they are eligible to vote
        if (age >= 18)
        {
            System.out.println ("You are eligible to vote.");
        }
        else
        {
            System.out.println ("You are not old enough to vote.");
            
        }
    }

}
