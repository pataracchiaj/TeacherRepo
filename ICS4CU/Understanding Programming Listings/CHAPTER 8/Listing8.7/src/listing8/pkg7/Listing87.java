/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listing8.pkg7;

/**
 *
 * @author mendozaad290
 */
public class Listing87 {

    /**
     * @param args the command line arguments
     */
   private static void ReportSummary (int[] summary)
   {
       String message = "question summar of/n correct answers: ";
       for (int n=0; n<5; n++)
           message += (" " + summary[n] );
       IO.showMessage (message);
     
        
        
    }
}
