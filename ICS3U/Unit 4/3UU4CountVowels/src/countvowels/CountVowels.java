/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package countvowels;
import java.io.*;
/**
 *
 * @author JT
 */
public class CountVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));// user input

    int tryAgain=1; //initiates try again in dowhile loop

    System.out.println("Count Vowels");
    System.out.println("============");

    do{
        //Program output
    System.out.println("Type a sentence and this program will tell you");
    System.out.println("how many vowels there are (excluding 'y'):");
    System.out.println();
    String sentence = br.readLine();

    int unicodeVal;//will store Unicode
    int vowels=0; //will store number of vowels

    for (int i = 0; i<sentence.length(); i++){//for loop which repeats until the entire string is checked for vowels
    unicodeVal=sentence.charAt(i);//inserts the unicode of the character at "i" into the variable

    if ((unicodeVal==97)||(unicodeVal==101)||(unicodeVal==105)||(unicodeVal==111)||(unicodeVal==117)){//if unicode shows that character is a vowel
    vowels=vowels+1;}//add 1 to the number of vowels
    }//ends for loop

    //Program output
    System.out.println();
    System.out.println("There are "+vowels+" vowel(s) in the phrase you've entered.");
    System.out.println();
    System.out.println("Press 1 to try a new phrase or press any other number to exit.");
    tryAgain=Integer.parseInt(br.readLine());
    System.out.println();

    }while(tryAgain==1);//will reinitiate program if user decides to enter a new phrase
    }

}

