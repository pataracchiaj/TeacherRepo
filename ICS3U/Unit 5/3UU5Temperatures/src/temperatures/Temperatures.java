/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatures;

import java.io.*;

public class Temperatures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Declare a new array
        int temp[] = new int[7]; //temp array
        String day[] = new String[7]; // day array

        //Days of the week
        day[0] = "Monday";
        day[1] = "Tuesday";
        day[2] = "Wednesday";
        day[3] = "Thursday";
        day[4] = "Friday";
        day[5] = "Saturday";
        day[6] = "Sunday";

        //Using a for loop to populate the array
        //for loop to ask for temperatures
        for (int i = 0; i < 7; i++) {
            System.out.println("Please enter the temperature for " + day[i]);
            temp[i] = Integer.parseInt(br.readLine());
        }

//for loop to display temperatures
        for (int i = 0; i < 7; i++) {
            System.out.println("Your daily high temperature for " + day[i] + " is " + temp[i]);
        }
    }
}
