/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kilostopounds;

import java.util.Scanner;

/**
 *
 * @author Floyd
 */
public class KilosToPounds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner keyedInput = new Scanner(System.in);

        double weightKG;
        double weightLB;

        System.out.print ("Enter your weight in kilograms: ");
        weightKG = keyedInput.nextDouble();

        weightLB = weightKG * 2.2;

        System.out.println (weightKG + " kilograms is equal to " + weightLB + " pounds");
        
    }

}
