/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package standardtime;
import java.io.*;

public class StandardTime {

    static String amPM;//will hold am/pm for standard time
    static String traditionalTime;//will store traditional time from user
    static int mins1, mins2, hours;//will store hours and minutes

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));// user input

    int tryAgain=1;//will initial do-while loop
    System.out.println("Standard Time to Traditional Time Converter");
    System.out.println("===========================================");
    do{
    System.out.println();
    System.out.println("Input a time in Standard Form (HH:MM:SS):");
    String standardTime=br.readLine();//user inputs time in standard form
    System.out.println();



    do{
    if ((standardTime.length())!=8){
    System.out.println("Invalid time entered.");
    System.out.println("Input a time in Standard Form that has this form HH:MM:SS ...");
    standardTime=br.readLine();//user inputs time in standard form
    System.out.println();
    }
    }while((standardTime.length())!=8);

    convertToTraditional(standardTime);

    System.out.println(standardTime+" is equivalent to "+traditionalTime);
    System.out.println();
    System.out.println("Enter 1 to try again.");
    tryAgain=Integer.parseInt(br.readLine());//user decides to try again
    }while(tryAgain==1);//will repeat if user enters 1

 }//closes main body

 public static void convertToTraditional(String standardTime){//sub routine will convert standard to traditional

 char H1, H2, M1, M2;
 H1 = standardTime.charAt(0);
 H2 = standardTime.charAt(1);
 M1 = standardTime.charAt(3);
 M2 = standardTime.charAt(4);

 int h1 =  Character.getNumericValue(H1);
 int h2 =  Character.getNumericValue(H2);
 mins1 =  Character.getNumericValue(M1);
 mins2 =  Character.getNumericValue(M2);

 hours = (h1*10)+h2;// will hold the hours

 if (hours>=12){//in a case where the time entered is after noon

 amPM=("PM");
 hours = hours-12;//will set the number of hours to standard time
 if (hours==0){
 hours = 12;}
 if (hours==12){
 amPM = ("AM");}////due to midnight - set amPM to AM

 }//closes after noon if
 else{
 amPM=("AM");}



 traditionalTime=(hours+":"+mins1+""+mins2+" "+amPM+".");//makes the traditional time string complete

 }//closes converToTraditional method

}
