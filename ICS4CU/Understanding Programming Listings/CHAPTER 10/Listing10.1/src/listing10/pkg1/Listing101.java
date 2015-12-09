/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listing10.pkg1;

//Fact() Return the factorial of parameter n        
// IN: n is a postive integer number

public class Listing101 {
    
    public static void main(String[] args)
    {
       int num, answer;
       num= IO.readInt ("Enter an integer: ");
       answer = Fact (num);
       IO.showMessage ("Factorial is:" + answer);
       System.exit(0);
    }
    
    public static int Fact (int n)
    { int temp;
    if (n <=1)
        temp =1;
    else 
        temp = n * Fact(n-1);
    return (temp);
    
    }
}


  