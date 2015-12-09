/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4pro21;
import java.util.Scanner;
/**
 *
 * @author mendozaad290
 */
public class CH4PRO21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        Scanner keyedInput = new Scanner (System.in);
    double plank, width;
    plank = 0.0;
    width = 0.0;
    double boardfeet;
    boardfeet = 0.0;
    double length;
    length = 0.0;
    double thickness;
    thickness = 0.0;
      
    while ( boardfeet < 15.0)
    {
     System.out.println("Enter length of the plank:");   
     length = keyedInput.nextDouble(); 
     System.out.println("Enter width of the plank:");  
     width = keyedInput.nextDouble(); 
     System.out.println("Enter the thickness of the plank:");  
     thickness = keyedInput.nextDouble(); 
     
  

  if ( boardfeet <= 15.0)
      
  {  
      boardfeet = (length * width * thickness) / 144;
  
  }
 
         
   System.out.println( "Boardfeet = " + boardfeet);  
   
    boardfeet = boardfeet + 1.0;
    
    
   
     
    
    } 
    
    
    
    
    
    
    }
}
