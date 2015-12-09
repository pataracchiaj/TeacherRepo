/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayexample;

import java.io.*;

public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in));

        //Declare a new array
        String word[] = new String[3];

        //Using a for loop to populate the array
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter word: "
                    + (i + 1));
            word[i] = br.readLine();

        }
        System.out.println("The following words are "
                + "stored in the array: ");

        //Using a for loop to display the contents
        for (int i = 0; i < 3; i++) {

            System.out.println(word[i] + "is stored in "
                    + "the index " + i + " of the array.");


        }
    }
}
