/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3pro9;
import java.util.Scanner;
/**
 *
 * @author mendozaad290
 */
public class CH3PRO9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your principal loan:");
        double principal = input.nextDouble();


        System.out.println("Enter the number of months a payment is to be made:");
        double period   = input.nextDouble();
    
    
         System.out.println("Enter your interest rate(%):");
         double rate = input.nextDouble();

         if ( rate > 1.00 && rate < 0.00){ 
    System.out.println(" need to enter the percentace correctly.");
} 
        
        
        
        
        System.out.println("your total cost is " + loanCost(principal, rate, period));
    }

    public static double loanCost(double principal,
            double rate,
            double period) {
        double payment;
    
      


        double denominator = Math.pow(1 - (1 + rate), -period);

        double payment1 = rate / denominator;

        payment = (payment1) * principal;
        
        double cost = principal - period * payment;

        return (cost);

    
    
    
    
    
    }
}
