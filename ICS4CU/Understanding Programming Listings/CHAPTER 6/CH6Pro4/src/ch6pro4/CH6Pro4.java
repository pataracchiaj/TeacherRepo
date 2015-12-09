/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6pro4;
import java.util.Scanner;
/**
 *
 * @author mendozaad290
 */
public class CH6Pro4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
       double sqr;
      int square,n; 
    System.out.println("N          Square Root                             Square");
      
        
     
       for (n=0; n<16; n++)
       { 
           sqr= Math.sqrt(n);
           square= n * n;
           System.out.println( n+"    "+  sqr + "              Squared:" + square);
          
       }
    
    
    
    
    }
}
