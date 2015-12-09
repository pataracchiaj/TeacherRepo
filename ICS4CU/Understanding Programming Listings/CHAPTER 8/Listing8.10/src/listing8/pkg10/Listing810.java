/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listing8.pkg10;

/**
 *
 * @author mendozaad290
 */
public class Listing810 {

    /**
     * @param args the command line arguments
     */
 private static int LookUpName (String[] phone_number, String this_number)
 {
     boolean notfound = true;
     int n=0;
     while (notfound && (n<1000))
     { if (this_number.equals(phone_number[n]))
         notfound = false;
     else n++;
         }
     if (notfound)
     {
         IO.showMessage ("NAME NOT FOUND!");
         System.exit(0);
     }
            
     return n;
    }
}
