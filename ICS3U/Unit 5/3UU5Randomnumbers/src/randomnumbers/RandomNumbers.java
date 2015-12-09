/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package randomnumbers;
import java.io.*;

public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main (String args []) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));// user input

        System.out.println("Random Number Generator");
        System.out.println("=======================");
        System.out.println();
        
        int tryAgain = 1;//initializes first do-while loop

        do{

        int numRandom, upperRange, lowerRange;//stores the total number of random numbers, upper range and the lower range
        int avgNum=0;//will store the average number generated

        System.out.println("Enter the number of random numbers to generate:");
        numRandom = Integer.parseInt(br.readLine());//user enters the number of random numbers

        do//a loop that catches an invalid range
        {
            System.out.println();
            System.out.println("Enter the upper range:");
            upperRange = Integer.parseInt(br.readLine());//user enters the upper range
            System.out.println();
            System.out.println("Enter the lower range:");
            lowerRange = Integer.parseInt(br.readLine());//user enters the lower range
            System.out.println();

            if (lowerRange>upperRange)
            {
                System.out.println("INVALID RANGE: Lower range cannot be bigger than the upper range.");
            }

        }while(lowerRange>upperRange);//loops if the user entered an invalid range

        int randNums[] = new int [numRandom];//creates an array with the appropriate size that will store random numbers

        System.out.println("GENERATED NUMBERS");
        System.out.println("=================");

        for (int i=0; i<numRandom; i++)// a loop used to populate the randNums[] array
        {
            randNums[i] = makeRandom (upperRange, lowerRange);//calls the makeRandom method
            System.out.println(randNums[i]);//print out a random number
            avgNum += randNums[i];// accumulates all of the random numbers in avgNum
        }

        System.out.println();
        avgNum = (avgNum/numRandom);//stores the average of the generated numbers
        System.out.println("Average of Random Numbers: "+avgNum);


        System.out.println();
        System.out.println("Enter 1 to try again:");

        tryAgain=Integer.parseInt(br.readLine());//user decides whether or not to try again
        System.out.println();

        }while(tryAgain==1);//will repeat if user decides to try again

    }//main method


    //a method that makes a random number betwen the upper and lower ranges
    public static int makeRandom (int u, int l)
    {
        int randNum = (int) Math.floor((u - l + 1) * Math.random() + l);//generates a random number between the lower and upper
        return randNum;//returns the random number to the main method
    }

}
