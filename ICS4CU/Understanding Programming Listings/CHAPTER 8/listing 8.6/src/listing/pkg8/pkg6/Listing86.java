/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listing.pkg8.pkg6;

/**
 *
 * @author mendozaad290
 */
public class Listing86 {

    /**
     * @param args the command line arguments
     */
    private static void GradeStudents
    (String filename, char[] answers, int[] summary, int numstudents)
    {
        DiskInput infile = new DiskInput();
        char [] integers = new char [25];
        infile.open ("key.txt");
        for (int n=0; n<5
                
        
        
        
       ;
        for (int n=0; n<numstudents; n++)
        {
            score=0;
            id= infile.readInt();
            for (int k=0; k<answers.length; k++)
            {
            thisanswer = infile.readChar();
            if (thisanswer == answers[k])
            {
                score++;
                summary[k]++;
            }
        }
        
        
        
        
    }
}
