/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package yourlastnameu3a6prog1;


import java.util. Scanner;

public class Main {

        public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);

        int number, times;

        System.out.println ("*********************");
        System.out.println ("****MAGIC DOUBLER****");
        System.out.println ("*********************");
        System.out.println();

        System.out.print ("Enter the number you would like doubled: ");
        number = keyedInput.nextInt();
        System.out.print ("Enter the number of times you would like to double the number " + number+ ": ");
        times = keyedInput.nextInt();
        System.out.println();

        for (int i=1;i<= times;i=i +1)
        {number= number*2;}

        System.out.println ("The Magic Doubler has made the calculation. The result is: " + number);

        System.out.println();
        System.out.println ("*********************");
        System.out.println ("****MAGIC DOUBLER****");
        System.out.println ("*********************");
    }

}
