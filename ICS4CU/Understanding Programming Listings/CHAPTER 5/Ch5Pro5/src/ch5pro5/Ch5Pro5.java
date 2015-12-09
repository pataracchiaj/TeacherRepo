/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5pro5;
import java.util.Scanner;
/**
 *
 * @author mendozaad290
 */
public class Ch5Pro5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
char lowerCaseLetter;

        char upperCaseLetter;

         

        Scanner myScanner = null;

        
        String line = myScanner.nextLine();

 

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a lowercase letter: ");

        //lowerCaseLetter = input.charAt( );

            lowerCaseLetter = line.charAt(0); //get the first char in the String

        

         

        if (lowerCaseLetter == 'a'){

            upperCaseLetter = 'A';
            System.out.println("The uppercase equivalent of "+ lowerCaseLetter + "is" +upperCaseLetter);

        }

        else

            System.out.println("Not a lowercase letter");


    }
}
