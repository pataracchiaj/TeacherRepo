/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8project1;
import java.io.*;

/**
 *
 * @author mendozaad290
 */
public class Ch8Project1 {

    /**
     * @param args the command line arguments
     */
   public static void main (String[] args) {
        char thisanswer;
        char[] answer = new char[20];
        DiskInput keyfile_in = new DiskInput();
        keyfile_in.open ("\\\\chs2\\010users$\\mendozaad290\\ICS4C\\CHAPTER 8\\Ch8Project1\\key.txt");
        for (int n=0; n<20; n++)
            answer [n] = keyfile_in.readChar();
        
  
        {
            
        }
        
        
        
         
         
        
        
        
        
        
        
    }
}
