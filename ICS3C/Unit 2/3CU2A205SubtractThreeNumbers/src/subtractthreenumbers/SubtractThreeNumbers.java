/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package subtractthreenumbers;

/**
 *
 * @author Floyd
 */
public class SubtractThreeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int value1;
        int value2;
        int value3;
        int value4;
        int answer;

        value1 = 23;
        value2 = 87;
        value3 = 11;
        value4 = 150;
        answer = value4 - value1 - value2 - value3;

        System.out.println ("The three numbers subtracted from 150 equals: " + answer);
    }

}
