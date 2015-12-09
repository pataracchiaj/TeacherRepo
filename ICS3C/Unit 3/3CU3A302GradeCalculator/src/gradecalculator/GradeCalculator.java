/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gradecalculator;

import java.util. Scanner;

public class GradeCalculator {

        public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);

        double grade;

        System.out.println ("*******GRADE*******");
        System.out.println ("****CALCULATOR*****");
        System.out.println ();

        System.out.print("Plese enter your grade: ");
        grade = keyedInput.nextDouble();
        System.out.println ();

        if (grade >=80)
            {System.out.println ("You received a mark of A.");}
        else if(grade >=70)
            {System.out.println ("You received a mark of B.");}
        else if(grade >=60)
            {System.out.println ("You received a mark of C.");}
        else if(grade  >=50)
            {System.out.println ("You received a mark of D.");}
        else
            {System.out.println ("You received a mark of F.");}

        System.out.println ();
        System.out.println ("*******GRADE*******");
        System.out.println ("****CALCULATOR*****");

    }
}
