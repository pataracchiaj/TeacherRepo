/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bmicalculator;
import javax.swing.*;
import java.io.*;
/**
 *
 * @author James
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
 {
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));// user input

       
    System.out.println("BMI Calculator v.1.0");
    
    System.out.println("Please select your prefferred system.");
    System.out.println("=====================================");
    System.out.println("1 for Metric System");
    System.out.println("2 for Imperial System");

    int choice = Integer.parseInt(br.readLine());//user inputs system choice
    System.out.println("");
    double BMI=0;//will store user's BMI after calculated

    if(choice==1){//Metric Option
    System.out.println("Input your weight (kg):");
    double weight = Integer.parseInt(br.readLine());//user input weight (kg)
    System.out.println("");
    System.out.println("Input your height (m):");
    double height = Double.parseDouble(br.readLine());//user imput height (m)
    BMI = weight/(height*height);//BMI calculated
    }//metric option closed

    if(choice==2){//Imperial option
    System.out.println("Input your weight (lbs):");
    double weight = Integer.parseInt(br.readLine());//user input weight (lbs)
    System.out.println("");
    System.out.println("Input your height (inches):");
    double height = Integer.parseInt(br.readLine());//user imput height (inches)
    BMI = (weight*703)/(height*height);//BMI calculated
    }//metric option closed

    BMI = BMI - (BMI%.01);//rounds BMI to two sig figs
    System.out.println("");
    System.out.println("Your BMI is "+BMI);

    if(BMI<15){//starvation if
    System.out.println("You are suffering from starvation.");}

    if((15<=BMI)&&(BMI<18.5)){//underweight if
    System.out.println("You are underweight.");}

    if((18.5<=BMI)&&(BMI<=25)){//ideal if
    System.out.println("Your BMI is at an ideal state.");}

    if((25<BMI)&&(BMI<=30)){//overweight if
    System.out.println("You are overweight.");}

    if((30<BMI)&&(BMI<=40)){//obese if
    System.out.println("You are obese.");}

    if(BMI>40){//morbidly obese if
    System.out.println("You are morbidly obese.");}

    }

}