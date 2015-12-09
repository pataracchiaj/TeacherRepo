/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listing.pkg8.pkg4;

/**
 *
 * @author mendozaad290
 */
public class Listing84 {

 final int QUIZSIZE = 5;
 final int NUMSTUDENTS = 4;
 final String keyfile = " key,txt";
 final String studentfile = "student.txt";
 
   private static void InputAnswerKey (String filename, int[] answers);
   {
       //to be completed!
   }
   
   private static void GradeStudents (String filename, int[] answers, int[] summary)
   {
       //to be completed!
   }
   
   private static String ReportSummary (int[] summary)
   {
       //to be comepleted;
   }
 
 
 
 
 
 
 
 
 
 
    public static void main(String[] args) {
     
        char[] answers = new char [QUIZSIZE];
        int[] summary = new int [QUIZSIZE];
        
        InputAnswerkey (keyfile, answers);
        GradeStudents (studentfile, answers, summary, NUMSTUDENTS);
        ReportSummary (summary);
       
    }
}
