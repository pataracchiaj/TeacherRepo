/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listing.pkg7.pkg3;

/**
 *
 * @author mendozaad290
 */
public class Listing73 {
    private String name;
    private int ID;
    private char grade;

 
 public void diskRead (DiskInput infile)
{ name= infile. readString();
  ID = infile.readInt();
  grade = infile.readChar();
} 

public String displayStudent ()
{
  return (name + ", " + ID + ", " + grade);
}

public void changeGrade (char newgrade)
{ grade= newgrade;
}

public void diskWrite (DiskOutput outfile)
{ outfile.println (name);
  outfile.println (" " + ID);
  outfile.println (" " + grade);
  

}
   
   
    
    
    
    
    
    }



