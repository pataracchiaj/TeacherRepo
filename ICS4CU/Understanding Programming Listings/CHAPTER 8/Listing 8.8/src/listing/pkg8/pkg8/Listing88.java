/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listing.pkg8.pkg8;

/**
 *
 * @author mendozaad290
 */
public class Listing88 {
    {
        final static int NUM_ENTRIES = 1000;
        final static String filename = "phone_book.txt";
     
    }
    
    private static void InputPhoneBook
    (String filename, String[] phone_number, String[] name)
    {
        // to be completed
    }
    
    private static int LookUpName (String[] phone_number, String this_number)
    {
        // to be completed
    }
    
     
    
    public static void main(String[] args) {
     
        String[] phone_number= new String [NUM_ENTRIES];
        String this_number;
        String[] name = new String[NUM_ENTRIES];
        int index;
        inputPhoneBook (filename, phone_number, name); // oval a)
        this_number = IO.readString ("enter phone number: "); // oval b)
        index = LookupName (phone_number, this_number); // this line and next are
        IO.showMessage (" the name is: " + name[index]); // oval c)
        
    }
}
