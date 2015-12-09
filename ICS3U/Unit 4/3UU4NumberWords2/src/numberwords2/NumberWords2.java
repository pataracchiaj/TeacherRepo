/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package numberwords2;
import java.io.*;

public class NumberWords2 {

    /**
     * @param args the command line arguments
     */
     public static void main (String args []) throws IOException
 {
  BufferedReader br = new BufferedReader (new InputStreamReader (System.in));// user input

    System.out.println("Numbers to Words (1-999 Edition)");
    System.out.println("================================");
    int tryAgain=1;//will initiate the first do-while loop of the program.
    do{
    System.out.println();
    System.out.println("Input a number (1-999) and this program will repeat it to you with words.");
    double numInput=Integer.parseInt(br.readLine());//user inputs number
    System.out.println();

    int error=1;//will initiate error check

    do{
    if(numInput<1 || numInput>999){//if the user enters an invalid number
    System.out.println("Invalid number. Enter a number between 10 and 99.");
    numInput=Integer.parseInt(br.readLine());//user must re-enter a number if they entered an invalid one
    System.out.println();}
    else{
    error=0;}//will end error loop if the number is correct
    }while(error==1);

    System.out.println();

    double hundredsDigit = Math.floor(numInput/100);
    double tensDigit = Math.floor((numInput % 100)/10);
    double onesDigit = numInput%10;

    System.out.print("Your number in words is: ");
    if((numInput<=9)||((numInput>=20)&&(numInput<=109))||((numInput>=120)&&(numInput<=209))||((numInput>=220)&&(numInput<=309))||((numInput>=320)&&(numInput<=409))||((numInput>=420)&&(numInput<=509))||((numInput>=520)&&(numInput<=609))||((numInput>=620)&&(numInput<=709))||((numInput>=720)&&(numInput<=809))||((numInput>=820)&&(numInput<=909))||((numInput>=920)&&(numInput<=999))){//will initiate hundreds, tens, & ones routine
    hundreds(hundredsDigit);
    System.out.print(" ");//space between hundreds and tens
    tens(tensDigit);
    System.out.print(" ");//space between tens and ones
    ones(onesDigit);}

    else{//initiate hundreds and teens
    hundreds(hundredsDigit);
    System.out.print(" ");//space between hundreds and teens
    teens(onesDigit);}



    System.out.println();
    System.out.println();
    System.out.println("Press 1 to try again.");
    tryAgain=Integer.parseInt(br.readLine());//user decides to try again
    System.out.println();
    }while(tryAgain==1);//will repeat program if user chooses to enter another number

 }//closes main body

 public static void hundreds(double hundredsDigit){//will print out a "hundreds" value

    if (hundredsDigit == 0){
    System.out.print("");}
    if (hundredsDigit == 1){
    System.out.print("ONE HUNDRED");}
    if (hundredsDigit == 2){
    System.out.print("TWO HUNDRED");}
    if (hundredsDigit == 3){
    System.out.print("THREE HUNDRED");}
    if (hundredsDigit == 4){
    System.out.print("FOUR HUNDRED");}
    if (hundredsDigit == 5){
    System.out.print("FIVE HUNDRED");}
    if (hundredsDigit == 6){
    System.out.print("SIX HUNDRED");}
    if (hundredsDigit == 7){
    System.out.print("SEVEN HUNDRED");}
    if (hundredsDigit == 8){
    System.out.print("EIGHT HUNDRED");}
    if (hundredsDigit == 9){
    System.out.print("NINE HUNDRED");}


 }//closes hundreds method

 public static void tens(double tensDigit){//will print out a "tens" value

    if (tensDigit == 0){
    System.out.print("");}
    if (tensDigit == 2){
    System.out.print("TWENTY");}
    if (tensDigit == 3){
    System.out.print("THIRTY");}
    if (tensDigit == 4){
    System.out.print("FORTY");}
    if (tensDigit == 5){
    System.out.print("FIFTY");}
    if (tensDigit == 6){
    System.out.print("SIXTY");}
    if (tensDigit == 7){
    System.out.print("SEVENTY");}
    if (tensDigit == 8){
    System.out.print("EIGHTY");}
    if (tensDigit == 9){
    System.out.print("NINETY");}

 }//closes tens method

  public static void teens(double onesDigit){//will print out a teen value

    if (onesDigit == 0){
    System.out.print("TEN");}
    if (onesDigit == 1){
    System.out.print("ELEVEN");}
    if (onesDigit == 2){
    System.out.print("TWELVE");}
    if (onesDigit == 3){
    System.out.print("THIRTEEN");}
    if (onesDigit == 4){
    System.out.print("FOURTEEN");}
    if (onesDigit == 5){
    System.out.print("FIFTEEN");}
    if (onesDigit == 6){
    System.out.print("SIXTEEN");}
    if (onesDigit == 7){
    System.out.print("SEVENTEEN");}
    if (onesDigit == 8){
    System.out.print("EIGHTEEN");}
    if (onesDigit == 9){
    System.out.print("NINETEEN");}

 }//closes teens method

  public static void ones(double onesDigit){//will print out the one value

    if (onesDigit == 0){
    System.out.print("");}
    if (onesDigit == 1){
    System.out.print("ONE");}
    if (onesDigit == 2){
    System.out.print("TWO");}
    if (onesDigit == 3){
    System.out.print("THREE");}
    if (onesDigit == 4){
    System.out.print("FOUR");}
    if (onesDigit == 5){
    System.out.print("FIVE");}
    if (onesDigit == 6){
    System.out.print("SIX");}
    if (onesDigit == 7){
    System.out.print("SEVEN");}
    if (onesDigit == 8){
    System.out.print("EIGHT");}
    if (onesDigit == 9){
    System.out.print("NINE");}

 }//closes ones method

}
