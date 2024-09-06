//these are my imports
import java.util.Scanner;

/**
 * This is the class I will be using to explain variables
 */
public class VariablesExample
{
    
    /**
    *  This is the main method of my program
    *  @param - array of String args from the console
    */
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        final double TAX_RATE = 1.0825;
        System.out.print("What does your item cost: ");
        double itemPrice = kb.nextDouble();

        System.out.println("Your total price will be $" + (itemPrice * TAX_RATE));
        
        kb.close();
    }
}