import java.util.Scanner;

public class Methods
{
    private static Scanner kb = new Scanner(System.in);

    public static void main (String [] args)
    {
        //System.out.println((int)(Math.random()*100)+1);
        /*
        intro();
        Scanner kb = new Scanner(System.in);
        
        int a = 5;
        int b = 6;
        System.out.println(Math.pow(a,b));
         
        


        System.out.println("What job do you have?");

        System.out.println(printJob(kb.nextLine()));

        System.out.println(findSum(a,b));
        */

        System.out.println(findSum(5.0, 25));
        System.out.println(findSum(5, 25, 37));
    }

    public static String printJob(String job)
    {
        return "My job is: " + job;
    }

    public static void intro()
    {
        System.out.println("Welcome to today's lesson");
        System.out.println("What is your name?");
        String name = kb.nextLine();
    }

    public static int findSum(int firstNum, int secondNum)
    {
        return firstNum + secondNum;
    }

    public static double findSum(double firstNum, double secondNum)
    {
        return firstNum + secondNum;
    }


    public static int findSum(int firstNum, int secondNum, int thirdNumber)
    {
        return firstNum + secondNum + thirdNumber;
    }
}