/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grosswages2;

import java.io.*;

public class GrossWages2 {
//gross wage that will be calculated in the calculateGrossWage method, and printed in main method
    static double grossWage, bangladesh, china, dRepublic, haiti;
    
    public static void main(String[] args) throws IOException  {
        // TODO code application logic here
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));// user input

    int tryAgain=1;//initializes first do-while loop
  System.out.println("Gross Wage Calculator");
  System.out.println("=====================");
  System.out.println();
  System.out.println("This program will also show you the gross wages in Bangladesh,");
  System.out.println("China, Dominican Republic & Haiti.");
  do{
  System.out.println();
  System.out.println("Enter the number of hours worked:");
  double hours = Double.parseDouble(br.readLine());//user inputs hours
  System.out.println();
  System.out.println("Enter the hourly rate of pay (in $):");
  double rate = Double.parseDouble(br.readLine());//user inputs hourly rate
  System.out.println();
  
  calculateGrossWages(rate, hours);//calls method to calc gross wage
   
 System.out.println("Your gross wage: $"+grossWage);//displays gross wage to user
 System.out.println();
 System.out.println("In Bangladesh: $"+bangladesh);
 System.out.println("In China: $"+china);
 System.out.println("In Dominican Republic: $"+dRepublic);
 System.out.println("In Haiti: $"+haiti);
 System.out.println();
 System.out.println("Enter 1 to try again.");
 tryAgain=Integer.parseInt(br.readLine());//user decides whether or not to try again
 System.out.println(); 
 }while(tryAgain==1);//will repeat program if user decides to try again
  
 }//closes main body
 
 static void calculateGrossWages(double rate, double hours){
 
 //gross wages of coutnries 
 bangladesh=hours*0.15;
 china=hours*0.48;
 dRepublic=hours*1.60;
 haiti=hours*0.55;
 
 double OTpay = 0;//sets overtime pay to 0 if the user did not work overtime
 double OThours = hours - 40;
 
 if(OThours>0){
 OTpay = (OThours*(1.5*rate));
 hours = 40;}//set hours to 40 to rid of the extra hours that will be added on
 
 grossWage = (hours*rate)+OTpay;//calculates grossWage
 }//closes calculateGrossWages
 
}//closes GrossWages2 class 
