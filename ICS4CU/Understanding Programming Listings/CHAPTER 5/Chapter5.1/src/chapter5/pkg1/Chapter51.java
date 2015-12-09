/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5.pkg1;

/**
 *
 * @author mendozaad290
 */
public class Chapter51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float sal1, sal2, sal3, sal4, sal5, sal6, debt;
    debt = IO.readFloat (" enter national debt");
    
    IO.showValue (" the debt is now:", debt);
    sal1= IO.readFloat (" Enter a salary: ");
    sal2= IO.readFloat (" Enter a salary: ");
    sal3= IO.readFloat (" Enter a salary: ");
    sal4= IO.readFloat (" Enter a salary: ");
    sal5= IO.readFloat (" Enter a salary: ");
    sal6= IO.readFloat (" Enter a salary: ");
    
    debt = debt+ sal1;
    debt = debt+ sal2;
    debt = debt+ sal3;
    debt = debt+ sal4;
    debt = debt+ sal5;
    debt = debt+ sal6;
    
    IO.showValue (" Thank you, the debt is now only ", debt );
    
          
  
    
    
    
    
    
    }
}
