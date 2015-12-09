/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listing.pkg7.pkg2;

/**
 *
 * @author mendozaad290
 */
public class Listing72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    int count, value, sum =0;
    DiskInput infile = new DiskInput();
    DiskOutput outfile = new DiskOutput();
    infile.open ("data.txt");
    outfile.open ("results.txt");
    count = infile.readInt();
    for (int n=0; n<count; n++)
    {
        value= infile.readInt();
        sum+= value;
    }
        outfile.println ("sum is: " + sum);
        infile.close();
        outfile.close();
        System.exit(0);
        
    
    
    
    }
}
