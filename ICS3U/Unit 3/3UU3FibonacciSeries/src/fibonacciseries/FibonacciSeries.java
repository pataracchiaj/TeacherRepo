/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacciseries;
import java.io.*;
/**
 *
 * @author JT
 */
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
    //print the title of the program
    System.out.println("Fibonacci Series");
    System.out.println("================");
    System.out.println("This program will print the first twenty terms of the \nFibonacci series: 1, 1, 2, 3, 5, 8 ...");
    System.out.println();

    //prints the first 2 items in the Fibonacci Series
    System.out.println("1");
    System.out.println("1");

    //Declaring your variables
    int a, b, c;

    //set variables equal to current state (3rd number of f-series)
    a=1;
    b=1;
    c=2;

    //for loop begins at 2 and ends at 20, to ensure the rest are printed
    for(int i=2; i<=20; i++){

    a=b;//sets a to b
    b=c;//b is LATER set to c
    c=a+b;//c is the sum of a+b
    System.out.println(c);//print the c

    }
    }

}
