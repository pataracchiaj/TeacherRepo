                                     /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listings.pkg6.vi;

/**
 *
 * @author mendozaad290
 */
public class Listings6VI {

    /**
     * @param args the command line arguments
     */
    private static char  GetLetter() {
     char letter;
     do
         letter =IO.readChar ("Enter an upper-case letter: ");
     
     while (!Character.isUpperCase(letter));
     return (letter);
    
    
    
    
    }
}
