/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testfraction;

/**
 *
 * @author mendozaad290
 */
public class TestFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    Fraction two_thirds = new Fraction (2,3);
    Fraction x = new Fraction();
    Fraction result = new Fraction();
    x.input();
    result.set(x);
    result.add(two_thirds);
    result.output("The sum is: ");
    result.sex(x);
    result.mult(two_thirds);
    result.output("The product is: ");
    if (x.isless(two_thirds))
        IO.showMessage ("less than 2/3");
    else 
        IO.showMessage ("greater or equal to 2/3");
    System.exit(0);
    
          
    
    
    
    
    
    
    
    
    
    }
}
