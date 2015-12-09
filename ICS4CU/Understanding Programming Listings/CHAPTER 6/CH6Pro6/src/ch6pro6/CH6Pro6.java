/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6pro6;
import java.util.Scanner;
/**
 *
 * @author mendozaad290
 */
public class CH6Pro6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
 System.out.println("Enter a list of numbers to find the factorial of it:");
  
   
int number = input.nextInt();
   
 
   
    int factor = 1;
    for (int i=1; i<=number; i++) {
            factor = factor*i;
       System.out.println(number+ ", "  + factor);
    }   
     
    
        
        
    
    
    
    
    
    }
}
