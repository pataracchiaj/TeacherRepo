/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6listing3;

/**
 *
 * @author mendozaad290
 */
public class CH6listing3 {

    /**
     * @param args the command line arguments
     */
    private static double AverageInput3 () {
    double sum = 0.0, value;
    int count;
    value = IO.readInt ("Enter a value (-1 to end):");
    for (count=0; value > 0.0; count=count+1)
    { 
        sum=sum+value;
        value=IO.readInt ("Enter value");
        
        
        
    }
    
    return(sum/count);
    
    
    }
}
