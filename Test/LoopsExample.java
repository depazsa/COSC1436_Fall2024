import java.util.Scanner;

public class LoopsExample
{
    public static void main(String [] args)
    {
        //indefinite loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (negative to quit)-> $ ");
        int number = scanner.nextInt();

        while(number >= 0)
        {
            System.out.println("You entered " + number);
            System.out.print("Enter an integer (negative to quit)-> $ ");
            number = scanner.nextInt();
        }

        System.out.println("You entered a negative number");

        //definite loop
        int x = 1;
        while(x <= 100)
        {
            System.out.println(x);
            x++;
        }
    }
}