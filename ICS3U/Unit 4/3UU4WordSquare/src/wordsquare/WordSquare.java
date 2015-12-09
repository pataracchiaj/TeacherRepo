/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wordsquare;
import java.io.*;
/**
 *
 * @author JT
 */
public class WordSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));// user input

    System.out.println("Welcome to Word Rectangle!");
    System.out.println("============================");
    int tryAgain=1;//initiates initial try again loop, and then user can later decide whether or not to try again

    do{
    System.out.println("Enter a word, and this program will make a word rectangle with it.");
    String word = br.readLine();//user enters a word
    word = word.toUpperCase();//makes the word upper case for the sake of the word square
    System.out.println("");

    for (int j = 0; j<word.length(); j++){//j for loop - repeats for as long as the word length
    int k=j;//k starts at the interval j on each line, so it will be able to shift the letters over 1

    for (int i = 0; i<word.length(); i++){//i for loop - repeats for as long as the word length

    System.out.print(word.charAt(k));//prints a letter
    k=k+1;//will cause the next letter to print

    if(k==word.length()){//if k is at the word length, an error will occur, so reset counter k to 0 and to print the first letter
    k=0;}//closes if

    }//closes i for loop

    System.out.println();//goes to the next line after the entire word is finished
    }//closes j for loop

    System.out.println();//asks user to tryagain:
    System.out.println("Press 1 to try another word. Press any other number to exit.");
    tryAgain=Integer.parseInt(br.readLine());//user inputs decision
    System.out.println();
    }while(tryAgain==1);//will repeat if user decides to try again



    }

}
