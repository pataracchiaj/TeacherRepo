/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sinchecker;
import java.io.*;
/**
 *
 * @author James
 */
public class SINChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        // TODO code application logic here
         BufferedReader br = new BufferedReader (new InputStreamReader (System.in));// user input


    System.out.println("Social Insurance Number");
    System.out.println("=======================");
    System.out.println("In Canada, each person is uniquely identified by the Government with a");//program purpose
    System.out.println("Social Insurance Number(SIN). A Social Insurance number consists of");
    System.out.println("nine digits. The first eight numbers are assigned digits and the last");
    System.out.println("number is a check digit. This program determines if the check digit for a");
    System.out.println("SIN is correct.");
    System.out.println();

    System.out.println("Enter a Social Insurance Number (no spaces):");
    String SIN=br.readLine();//user inputs SIN number

    //Declaration of some variables
    String even;
    int evenSum;
    int numofdigits;
    even = "";
    evenSum = 0;


    //multiply the even digits by two
	for (int i = 1; i <= 7; i += 2){
		even += 2 * Character.getNumericValue(SIN.charAt(i));
	}

    //Obtain the number of digits in the string
    numofdigits = even.length();

    //add the digits of the previous calculation
	for (int i = 0; i < numofdigits; i++) {
		evenSum += Character.getNumericValue(even.charAt(i)) ;
	}
   
      
    //step three: add together digits not multiplied by 2
    int oddOne = SIN.charAt(0);//gets character at each odd number
    int oddTwo = SIN.charAt(2);
    int oddThree = SIN.charAt(4);
    int oddFour = SIN.charAt(6);

    
    int odd1 = Character.getNumericValue(oddOne);//converts characters into integer values
    int odd2 = Character.getNumericValue(oddTwo);
    int odd3 = Character.getNumericValue(oddThree);
    int odd4 = Character.getNumericValue(oddFour);

    

    int sumOdd = odd1+odd2+odd3+odd4;//adds all the odd digits

    //step four: sum together the sums of even*2 and odd
    double sum = sumOdd+evenSum;

    //step five: subtract sum from next highest multiple of 10
    //find higher multiple of 10 first:
    double highMultiple;
   
   //add the results of oddSum and evenSum and subtract that from the next highest multiple of 10
    highMultiple = ((10 * Math.ceil((sum)/10)) - (sum));

    int correctCheckDigit = (int)highMultiple;//the check digit should be this value

    char checkDigit = SIN.charAt(8);//this finds the character of the check digit given
    int checkDigitNumeric = Character.getNumericValue(checkDigit);//this converts the character into an integer value

    System.out.println();

    if(checkDigitNumeric!=correctCheckDigit){//check if checkDigitNumeric is the same as the correct check digit
    System.out.println("The check digit of the SIN is incorrect. It should be "+correctCheckDigit+".");}//if not the same, tell user it is incorrect
    else{//if the same, tell user it is correct
    System.out.println("The check digit of the SIN is correct.");}

    }

}
