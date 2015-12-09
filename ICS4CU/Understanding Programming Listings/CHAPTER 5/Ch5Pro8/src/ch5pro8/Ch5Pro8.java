/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5pro8;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author mendozaad290
 */
public class Ch5Pro8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        int a = 0, b =0, c=0, d=0, e=0,f=0, g=0, h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0;
       int p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
 
   char  letter;
   String output;
   
   letter = IO.readChar ( " Enter a character");
 
  while (letter != '1')
  {
   letter = Character.toLowerCase(letter);   
      if ( letter == 'a') 
      System.out.print(" .-");
      
      else if (letter == 'b') 
      System.out.print(" -...");    
      
      else if (letter == 'c')
      System.out.print(" -.-."); 
      
       else if (letter == 'e')
      System.out.print(" sikeee"); 
      
      letter = IO.readChar("enter next character: ");
      
      
              
  }
    
    
    
  
    
    }
}
