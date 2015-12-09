

//student's header would appear here
import java.util. Scanner;
public class NewClass {
public static void main(String[] args) {
Scanner keyedInput = new Scanner(System.in);
int factorial, value;           //student's comments would appear here
value = 1;
System.out.println ("**********************");
System.out.println ("******FACTORIALS******");
System.out.println ("**********************");System.out.println ();
System.out.print ("Enter the number in order to calculate it's factorial: ");
factorial = keyedInput.nextInt();
if (factorial <= 0)
{System.out.println ("Sorry, that is an invalid value.");}

else{
for (int i=1; i<= factorial;i++)
{value = value * i;}
System.out.println ("The factorial is : " + value);
}
System.out.println ();
System.out.println ("**********************");
System.out.println ("******FACTORIALS******");
System.out.println ("**********************");
}
}


