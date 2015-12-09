package ch5pro8;

import javax.swing.JOptionPane;

/**
 * Listing A.I.
 * 
 * The IO class is based on the JOptionPane library of Swing. In fact, it is basically
 * a simple wrapper for this useful library. The basic methods of the JOptionPane class
 * used in the IO class were explained in chapter 12.
 * 
 * @author Scott Cannon 
 * @2003
 */
public class IO
{
    public static void showMessage (String s)
    {JOptionPane.showMessageDialog(null, s);
    }

    public static void showValue (String s, double d)
    {JOptionPane.showMessageDialog(null, s+d);
    }

    public static void showValue (String s, float f)
    {JOptionPane.showMessageDialog(null, s+f);
    }

    public static void showValue (String s, int i)
    {JOptionPane.showMessageDialog(null, s+i);
    }

    public static void showValue (String s, char c)
    {JOptionPane.showMessageDialog(null, s+c);
    }

    public static void showValue (String s1, String s2)
    {IO.showMessage(s1+s2);
    }

    public static double readDouble (String prompt)
    {   String s;
        s = JOptionPane.showInputDialog(prompt);
        return (Double.parseDouble(s));
    }
    
    public static float readFloat (String prompt)
    {   String s;
        s = JOptionPane.showInputDialog(prompt);
        return (Float.parseFloat(s));
    }
    
    public static int readInt (String prompt)
    {   String s;
        s = JOptionPane.showInputDialog(prompt);
        return (Integer.parseInt(s));
    }
    
    public static char readChar (String prompt)
    {   String s;
        s = JOptionPane.showInputDialog(prompt);
        if  (s == null)
            return 0;
        else if (s.length() > 0)
            return s.charAt(0);
        else
            return '\n';
    }
    
    public static String readString(String prompt)
    {   return (JOptionPane.showInputDialog(prompt));
    }
    
    public static String concatenate(String s1, String s2)
    {return (s1 + s2);
    }
    
    public static String concatenate(String s1, double d)
    { return (s1 + d);
    }
}
