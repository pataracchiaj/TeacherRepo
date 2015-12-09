/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package temperaturestats;
import java.io.*;

public class TemperatureStats {

    /**
     * @param args the command line arguments
     */
    public static void main (String args []) throws IOException
 {BufferedReader br = new BufferedReader (new InputStreamReader (System.in));// user input

    int tryAgain=1;//will initialize the first do-while loop

   System.out.println("Daily Temperatures For a Week");
   System.out.println("=============================");
   System.out.println("This program records the daily maximum temperatures for a week.");
   do{//will repeat for as long as the user wants to input new temperatures
   System.out.println();

   String day;//will store the name of a day
   int temperature[] = new int [7];//creates an array that will store a temperature for each day of the week
   int avgTemp=0;//will store the average temperature for the week

   for(int i=0; i<7; i++)//a loop that populates the array with temperatures
   {
        day = toDay(i);//calls the toDay method in order to find the appropriate day
        System.out.println("Enter the temperature for "+day+" (°C):");
        temperature[i] = Integer.parseInt(br.readLine());//gets the temperature from the user
        System.out.println();
   }//closes for loop

   System.out.println("TEMPERATURES");
   System.out.println("============");

   for(int i=0; i<7; i++)//a loop that displays the temperatures entered
   {
        day = toDay(i);//calls the toDay method in order to find the appropriate day
        System.out.println(day+": \t"+temperature[i]+"°C");
   }

   for(int i=0; i<7; i++)//a loop that sums the temperatures into avgTemp
   {
        avgTemp += temperature[i];//adds the value in temperature[i] into avgTemp
   }

   avgTemp = avgTemp/7;//divide the sum by 7 in order to get the average temperature

   System.out.println();
   System.out.println("Avg. Temp: \t"+avgTemp+"°C");//prints the average temperature to the user
   System.out.println();
   System.out.println("Enter 1 to input new temperatures:");

   tryAgain=Integer.parseInt(br.readLine());//user chooses to input a new temperature

   }while(tryAgain==1);//will repeat if the user enters 1


 }//closes the main method

 //a method that will convert the counter "i" in the for-loop to a day
 public static String toDay(int i)
 {
    String dayName;//stores the name of the day

    //conversion of i into a day name
    if(i==0)
    {
        dayName = "Sunday";
        return dayName;//returns the name of the day to the main function
    }

    if(i==1)
    {
        dayName = "Monday";
        return dayName;//returns the name of the day to the main function
    }

    if(i==2)
    {
        dayName = "Tuesday";
        return dayName;//returns the name of the day to the main function
    }

    if(i==3)
    {
        dayName = "Wednesday";
        return dayName;//returns the name of the day to the main function
    }

    if(i==4)
    {
        dayName = "Thursday";
        return dayName;//returns the name of the day to the main function
    }

    if(i==5)
    {
        dayName = "Friday";
        return dayName;//returns the name of the day to the main function
    }

    if(i==6)
    {
        dayName = "Saturday";
        return dayName;//returns the name of the day to the main function
    }

    return "";//this return is unreachable, however it is required in order to make the program run

 }//closes the toDay method


}
