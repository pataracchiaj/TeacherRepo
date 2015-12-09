/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listing.pkg6.vii;

/**
 *
 * @author mendozaad290
 */
public class Listing6VII {
final int NUMRATS =25;

//Classify(); returns a char (A, B, C, or D) corresponding to the group for this rat 
// IN: age, wt, feedings, activity (describing a particular rat)
private static char Classify (double age, double wt, int feedings, double activity)
{ //to be written
    
}
    public static void main(String[] args) 
      {  double age, weight, activity;
        int feedings;
        char group;
        String output;
        for (int count=0; count<NUMRATS; count++)
        { output= "enter age for rat" + count + ":";
        age= IO.readDouble (output);
        weight= IO.readDouble (" enter weight: ");
        feedings = IO.readInt (" enter number of feedings: ");
        activity= IO.readDouble ("enter activity: ");
        group = Classify (age, weight, feedings, activity);
        output = "rat" + count + " belongs to group " + group;
        IO.showMessage (output);
        }
        
    }
        
         
}
  
    
    
    
    
    
    
    
    

