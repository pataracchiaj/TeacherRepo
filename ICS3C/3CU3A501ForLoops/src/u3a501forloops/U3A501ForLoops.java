/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package u3a501forloops;

/**
 * Created by: Mr. Pataracchia Date started: Date completed: Program
 * description: Course: ICS 3C
 *
 * @author pataracchiaj
 */
import java.util.Scanner;

public class U3A501ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);

        // 1. Start at 1 and count up to 19 by 1
        for (int i = 1; i <= 19; i = i + 1) {
            System.out.println(i);
        }
        System.out.println();

        // 2. Start at 19 and count up to 25 by 1

        for (int i = 19; i <= 25; i = i + 1) {
            System.out.println(i);
        }
        System.out.println();
        // 3. Start at 13 and count up to 22 by 2

        for (int i = 13; i < 23; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();
        // 4. Start at 0 and count up to 299 by 25

        for (int i = 0; i < 300; i = i + 25) {
            System.out.println(i);
        }
        System.out.println();
        // 5. Start at 100 and count down to 51 by 10
        for (int i = 100; i > 50; i = i - 10) {
            System.out.println(i);
        }
        System.out.println();
        // 6. Start at 1000 and count down to 1 by 50
        for (int i = 1000; i > 0; i = i - 50) {
            System.out.println(i);
        }
    }
}
