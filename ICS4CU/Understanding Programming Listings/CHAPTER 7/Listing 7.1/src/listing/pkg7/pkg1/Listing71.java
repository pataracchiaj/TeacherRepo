/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listing.pkg7.pkg1;

/**
 *
 * @author mendozaad290
 */
public class Listing71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int count, value, sum =0;
    DiskInput infile= new DiskInput();
    infile.open (" data.txt");
    count = infile.readInt();
    for (int n=0; n<count; n++)
    {
        value =infile.readInt();
        sum += value;
  
    }
    
    IO.showValue ("sum is: ", sum);
    infile.close();
    System.exit(0);
    
    
    
    
    
    
    
    }
}
