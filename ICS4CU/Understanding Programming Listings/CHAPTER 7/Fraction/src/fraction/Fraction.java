/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author mendozaad290
 */
public class Fraction{
   
        private int num, denom;
        
        public Fraction()
        {
             num=1; denom=1;
        }   
        
        public Fraction (int a, int b)
        {
            num = a; denom = b;
        }
        
        public Fraction (int a )
        {
            num=a; denom =1;
        }
        
        public void input () 
        {
            num=IO.readInt ("enter the numerator: ");
            denom = IO.readInt (" enter the denominator: ");
            
        }
        
        public void output (String message)
        {
            IO.showMessage (message + num + "/" + denom);
        }
        
        public void set (int a)
        {
            num=a; denom=1;
            
        }
        
        public void set ( int a, int b)
        {
            num=a; denom=b;
        }
        
        public void set ( Fraction f)
        {
            num= f.numerator();
            denom= f.denominator();
            
        }
        
        public boolean isLess (Fraction f)
        {
            double temp1, temp2;
            temp1 = ((double) num) / denom;
            temp2 = ((double ) f.numerator()) / f.denominator();
            if (temp1 <temp2)
                return true;
            else 
                return false;
           
                       
        }
    
        
        public int numerator ()
        {
            return num;
        }
        
        public int denominator ()
        {
            return denom;
        }
        
        public void add (Fraction f)
        {
            int newdenom;
            newdenom = denom * f.denominator();
            num= num * f.denominator() + f.numerator() *denom;
            denom = newdenom;
            
            
        }
        
        public void mult (Fraction f)
        {
            denom = denom * f.denominator();
            num = num * f.numerator();
        }
        
        
        
        
        
        
        
        
        
        
}

