/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7pro2;


/**
 *
 * @author mendozaad290
 */
 
public class CH7PRO2 {
    

private int radius, height;

public CH7PRO2()
{
    radius=1; height=1;
}
    
      
 

   
   
   public static double getVolume  ( double volume)
   { 
  double p = 3.14159;     
  double h = 0;
  double r = 0;    
  double r2 = r*r ;
   volume = p * r2 * h;
 
           return (volume);
   }       
   
   
   
   public static double getSurfaceArea ( double surfaceArea  )
           
   {
      double p = 3.14159; 
      double r = 0;
      double h = 0 ;
      double r2 = r*r;
     surfaceArea = (2 * p * r2) + (2*p*r*h) ;
      
      
       
      
       return(surfaceArea);
       
   }

   
           




}
