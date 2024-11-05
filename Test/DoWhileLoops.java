import java.util.Scanner;

public class DoWhileLoops
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        int count = 1;

        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count <= 5);

        /*
        int number; 

        do {
            //loop body: code to execute
            System.out.print("Enter a number between 1 and 10 --- $ ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("Thank you! You entered: " + number);
         */
    }
}