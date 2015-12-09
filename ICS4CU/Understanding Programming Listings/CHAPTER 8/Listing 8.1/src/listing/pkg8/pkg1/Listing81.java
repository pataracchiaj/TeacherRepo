/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listing.pkg8.pkg1;
import javax.swing.JOptionPane;
import java.io.*;
/**
 *
 * @author mendozaad290
 */
public class Listing81 {

  final int SIZE =5;
    public static void main(String[] args) {
        
        String message;
        char thisanswer;
        int id, score;
        char[] answer = new char[5];
        
        DiskInput studentfile_in = new DiskInput();
        studentfile_in.open ("\\\\chs2\\010users$\\mendozaad290\\ICS4C\\CHAPTER 8\\students.txt");
        int [] summary = {0, 0, 0, 0};
        DiskInput keyfile_in = new DiskInput();
        keyfile_in.open ("\\\\chs2\\010users$\\mendozaad290\\ICS4C\\CHAPTER 8\\key.txt");
        
        for (int n=0; n<4; n++)
            answer[n]= keyfile_in.readChar();
        
        for (int n=0; n<5; n++) 
        {  score=0;
          id= studentfile_in.readInt();
          for (int k=0; k<5; k++)
          { thisanswer = studentfile_in.readChar();
            if (thisanswer == answer[k])
            {
                score++;
                summary[k]++;
            }
          }
          
          IO.showMessage (" student" + id + " score: " + score);
              
              
              
              }
        
        message= "question summary of\n correct answer:";
        for (int n=0; n<5; n++)
            message+= (" " + summary[n]);
        IO.showMessage (message);
        System.exit(0);
        
        
        
        
       
        
        
     
        
        
    
    
    
    
    }
}
