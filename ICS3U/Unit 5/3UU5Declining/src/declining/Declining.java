/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package declining;
import java.io.*;

public class Declining {

    /**
     * @param args the command line arguments
     */
    public static void main (String args []) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));// user input

        System.out.println("Declining Attendance");
        System.out.println("====================");
        System.out.println("Attendance has been steadily declining at weekly religious services from");
        System.out.println("1985. This program displays the percentage of the Canadian population that");
        System.out.println("attends a weekly religious service, from any year from 1985 to 2025.");

        int year;//will store a year entered by the user
        double percent[] = new double [41];//an array that will store the percentage of the Canadian population attending Church during various years

        for(int i=0; i<41; i++)//a loop that populates the percent array
        {
            percent[i] = toPercent(i);//calls the toPercent method
        }

        int tryAgain=1;//will initialize the the first do-while loop
        do{//will repeat if the user wants to try a new year

        System.out.println();

        do{//a do-while loop that will catch an incorrect year

        System.out.println("Enter a year from 1985 to 2025:");
        year = Integer.parseInt(br.readLine());//user enters a year
        System.out.println();

        if((year<1985)||(year>2025))//if the user entered an incorrect year
        {
            System.out.println("INVALID YEAR.");//warn user of an invalid entry
            System.out.println();
        }

        }while((year<1985)||(year>2025));//will repeat if the user inputs an incorrect year

        System.out.println("Percentage of Weekly Attendance: "+percent[year-1985]+"%");//displays the percentage to the user
        System.out.println();

        System.out.println("Enter 1 to input another year:");
        tryAgain=Integer.parseInt(br.readLine());//user decides to try again

        }while(tryAgain==1);//will repeat if the user decides to try again
    }//main method

    //a method that calculates the percentage of the Canadian population attending Church
    public static double toPercent(int i)
    {
        double percentage = 30 - (i*0.45);//calculates the percentage

        return percentage;//returns this percentage to the main program
    }

}
