/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6pro8;

/**
 *
 * @author mendozaad290
 */
public class CH6PRO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a=b=c=d=e=f=0;
    char grade;
    String output;
    grade= IO.readChar (" Enter grades as capital letters (ending with the letter X):");
    while (grade != 'x')
    { switch (grade)
      {  case 'A':    a++; break;
         case 'B':    b++; break;
         case 'C':    c++; break;
         case 'D':    d++; break;
         case 'f':    f++; break;
         default:     IO.showMessages ("illegal grade");
         
      }
        
        grade= IO.readChar("enter next grade");
    }
    
    }
output = "summary of grades: \n a:";
output= IO.concatenate (output, a);
output= IO.concatenate (output,"\n b:");
output= IO.concatenate (output, b);
output= IO.concatenate (output, "\n c:");
output= IO.concatenate (output, c);
output= IO.concatenate (output, "\n d:");
output= IO.concatenate (output, d);
output= IO.concatenate (output, "\n f:");
output= IO.concatenate (output, f);
IO.showMessage (output);
System.exit(0);


}
}

