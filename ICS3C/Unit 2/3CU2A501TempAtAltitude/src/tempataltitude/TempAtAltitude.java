/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tempataltitude;

import java.util.Scanner;       //imports the scanner component needed to read in input from the keyboard

//Created by: John Student
//Created for: Mr. Teacher
//Class: ICS 3C
//Filename: YourLastNameU2A5Prog1
//Date Started: Jan 29, 2011
//Date Finished: Jan 29, 2011
//This program prompts the user to enter the temperature at sea level as well as a given altitude.
//The program then calculates and outputs the temperature at the given altitude using the environmental lapse rate.

public class TempAtAltitude {

       public static void main(String[] args) {

           Scanner keyedInput = new Scanner(System.in);     //Scanner object used to receive input from the keyboard

           double seaLevelTemp;                 //These variable will hold the indicated data through the running of the program
           double altitude;
           double changeInTemp;
           double newTemp;
           final double LAPSRATE = 0.0065;      //This constant holds the environmental lapse rate

           System.out.println ("**TEMPERATURE CALCULATOR**");       //program output header
           System.out.println ();
           System.out.println ("By entering the current temperature at sea level");
           System.out.println ("as well as a given altitude, a new temperature will be calculated.");    //Instructions for the user
           System.out.println ();

           System.out.print ("Enter the current temperature at sea level: ");   //prompts the user to enter the current temperature at sea level
           seaLevelTemp = keyedInput.nextDouble();                              //stores the users data into the seaLevelTemp variable
           System.out.println ();

           System.out.print ("Enter the altitude: ");                           //prompts the user to enter the altitude
           altitude = keyedInput.nextDouble();                                  //stores the users data into the altitude
           System.out.println ();

           changeInTemp = altitude * LAPSRATE;                                  //determines the change in temperature and stores it in changeInTemp
           newTemp = seaLevelTemp - changeInTemp;                               //determines the newTemp at altitude given by user
 
           System.out.println ("The temperature at " + altitude + " meters is " + newTemp + " degrees celsius.");  //outputs the new temperature
           System.out.println ();

           System.out.println ("**TEMPERATURE CALCULATOR**");               //program output footer
    }
}
