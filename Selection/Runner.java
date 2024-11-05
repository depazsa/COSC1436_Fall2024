import java.util.Scanner;

public class Runner
{
    private static Scanner scan = new Scanner(System.in);

    public static void main(String [] args)
    {
        int a;
        System.out.print("Give me a number: ");
        numTester(scan.nextInt());
    }

    public static void numTester(int num)
    {
        if(num % 3 == 0)
        {
            if(num % 2 == 0)
            {
                System.out.println("This number is a multiple of 6");
            }
        }
    }
}