/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package labanimals;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author JT
 */
public class LabAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
    
        
    
   
    //Obtain values from the user and store them to the appropriate variables.
        String myinput = JOptionPane.showInputDialog("Lab Animals \n\nAt present there are x animals in a lab and enough food for y animals. \nAt the end of every hour the population doubles, and enough food is added to \nsupport z more animals. During any hour the animals will eat enough food for \nonly themselves. \nThis program will determine when the population will outgrow the food supply.\n\n Enter the Initial Animal Population (x): ");
        int population = Integer.parseInt(myinput);//user enters initial animal population
    
    myinput = JOptionPane.showInputDialog("Enter the initial food supply:");
    int initialFood = Integer.parseInt(myinput);//user enters initial food
    
    myinput = JOptionPane.showInputDialog("Enter the amount of food added each hour:");
    int hourlyFood = Integer.parseInt(myinput);//user enters food added each hour
    
    int food = initialFood;//set the food entering the loop to the initial food the user entered
    System.out.println("Lab Animals");
    System.out.println("===========");
    System.out.println();
    System.out.println("Hour - Animals @ Start - Food @ Start - Food @ End - Animals @ End");
    
    int i;//counter, will store number of hours+1
    for(i=1; food>=population; i++){//for loop which continues for as long as the food out numbers the # of animals
    
    System.out.print(i+"  \t");//initial hour stats
    System.out.print(population+"\t\t");
    System.out.print(food+"  \t");

    food = food - population + hourlyFood; //food at the end of the hour is calculated
    population = population*2;//population by the end of the hour is calculated
    
    System.out.print(food+"  \t");//end of hour stats
    System.out.print(population);
    System.out.println();
    }

    System.out.println();
    System.out.println("By hour "+(i-1)+", the population outgrows the food supply.");//i is subtracted 1 for the purpose of telling the user the amount of hours
    System.out.println("Therefore, it's survival of the fittest by hour "+(i-1)+".");
    System.out.println();
    
    }

}
