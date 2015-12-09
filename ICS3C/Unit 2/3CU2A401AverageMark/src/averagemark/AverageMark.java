/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package averagemark;

import java.util.Scanner;

public class AverageMark {

    public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);

        double mark1, mark2, mark3, mark4, mark5, average;

        System.out.println ("Enter the mark for test 1: ");
        mark1 = keyedInput.nextDouble();

        System.out.println ("Enter the mark for test 2: ");
        mark2 = keyedInput.nextDouble();

        System.out.println ("Enter the mark for test 3: ");
        mark3 = keyedInput.nextDouble();

        System.out.println ("Enter the mark for test 4: ");
        mark4 = keyedInput.nextDouble();

        System.out.println ("Enter the mark for test 5: ");
        mark5 = keyedInput.nextDouble();

        average = (mark1 + mark2 + mark3 + mark4 + mark5)/5;

        System.out.println ("The average is: "+ average);


    }

}
