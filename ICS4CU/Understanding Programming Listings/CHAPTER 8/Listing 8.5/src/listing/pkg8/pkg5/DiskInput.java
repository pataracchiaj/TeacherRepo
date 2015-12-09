/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listing.pkg8.pkg1;
import java.io.*;
/**
 *
 * @author mendozaad290
 */
public class DiskInput {
    
    private BufferedReader input =null;
    private String s;
    
    public void open (String filename)
    {  try
    { input = new BufferedReader (new FileReader (filename));
    
    }
    catch (Exception e)
    { IO.showMessage ("file not found:");
        System.exit(0);
    }
    }   
    
    private void close ()
    { try
    { input.close();
        }
    catch (Exception e)
    {
        IO.showMessage ("file closing error!");
        System.exit(0);
    }
    }
    
    private void readLine ()
    { try
    {
        s = input.readLine();
    }
    catch (Exception e)
    {
        IO.showMessage (" incorrectt input!");
        System.exit(0);
    }
    
    }
    
    public int readInt()
    { readLine();
    return (Integer.parseInt(s));
    }
public double readDouble ()
    {
       readLine();
       return (Double.parseDouble(s));
    }

public char readChar ()
{readLine();
if (s==null)
    return 0;
else if (s.length () > 0)
    return s.charAt (0);
else
    return '\n';
}

public String readString ()
{ readLine();
return s;
}
    
    
    
    
    
    
        
            
            
            
            
            
            
            
            }
    




















