/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listings.pkg6.viii;

/**
 *
 * @author mendozaad290
 */
public class Listings6VIII {
 // Classify(); returns a char (A, B, C, or D) corresponding to the group for this rat
 // IN: age, wt, feedings, activity (describing a particular rat)
    
 private static char Classify ( double age, double wt, int feedings, double activity)
 {      char group;
        if ((wt<= 5.0)&&(age<2.0)&&(activity<=4.0)&&(feedings<=5))
           group= 'A';
        else 
            boolean class1= ((2<=age)&& (age< 4) && (activity<4));
            boolean class2= ((4<=age)&& (age< 6) && (activity>=4));
            if ((wt < 7.0) && (class1 || class2))
            group = 'B';
            else 
            { boolean ageclass1 =(age> 6.0) || (age <3.0);
              boolean feedclass = (6 <= feedings) && (feedings <10);
              boolean class3 = (feedings >10) && (age >= 6.0);
              if ((ageclass1 && feedclass) || class3)
                  group= 'c';
              else group= 'D';
              
            }
    
    
    
    
    
    }
}
