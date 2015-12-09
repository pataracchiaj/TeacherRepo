/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package earnedwages;

import java.util.Scanner;
/**
 *
 * @author Floyd
 */
public class EarnedWages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner keyedInput = new Scanner (System.in);

        double hours, rate, totalPay;

        System.out.print ("Enter the number of hours worked and press Enter: ");
        hours = keyedInput.nextDouble();

        System.out.print ("Enter the rate of pay per hour press Enter: ");
        rate = keyedInput.nextDouble();

        totalPay = rate * hours;

        System.out.println ("The total amount earned is: $" + totalPay);
        
        // TODO code application logic here
    }

}
