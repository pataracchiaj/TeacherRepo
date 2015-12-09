/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6listings4;

/**
 *
 * @author mendozaad290
 */
public class CH6Listings4 {

    /**
     * @param args the command line arguments
     */
   
       
     private plotYAxis()
     {
         
     }
     private PlotPoint (double angle)
     {
         
     }
        
        
  public static void main(String[] args) {       
   double angle, anglestep, limit;
   String output;
   limit = 2* Math.PI;
   anglestep= limit/ 20.0;

   output = PlotYAxis();
   
   // draw the Y axis and 
   // plot a point for each angle from 0 to 2 PI in steps of 2PI/20
   
   for ( angle=0.0; angle < limit; angle= angle+anglestep)
       output = output + PlotPoint ( angle);
   
   IO.showMessage ( output);
   System.exit(0);
    
  
  
  }
}
