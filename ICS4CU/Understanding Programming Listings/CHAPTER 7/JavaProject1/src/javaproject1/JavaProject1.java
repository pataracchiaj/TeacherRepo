/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject1;


/**
 *
 * @author mendozaad290
 */
public class JavaProject1 {

    /**
     * @param args the command line arguments
     */
  private static float Power(int base, int exp) {
  
        int e = base;
      
        
       for (int count = 1; count < exp; count++) {
          
           base = base * e;
       if( count >= exp ) { System.out.print(""); } 
      
            }
      
        return (base);
 }
        
        
 private static float Power(float base, int exp) {
    
        float e = base;
        
       for (int count = 1; count < exp; count++) {
          
           base = base * e;
       if( count >= exp ) { System.out.print(""); } 
      
            }
      
        return (base);
 }
    

         
       
        
    
    
    
    
    
    
    }

   
    
    
    
    
            
    
    
    
    
   

