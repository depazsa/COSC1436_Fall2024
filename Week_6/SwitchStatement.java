import java.util.Scanner;

public class SwitchStatement
{
    /*
    switch (expression) {
    case value1:
        // Code to execute if expression equals value1
        break;
    case value2:
        // Code to execute if expression equals value2
        break;
    // You can have any number of case statements
    default:
        // Code to execute if none of the cases match
        break;
    }
     */

    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Exit");
        System.out.print("-> : ");
       
        int userChoice = scan.nextInt();

        while(userChoice != 3)
        {
            switch (userChoice) {
                case 1:
                    System.out.println("Starting the game...");
                    break;
                case 2:
                    System.out.println("Loading the game...");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }

            System.out.println("Select an option:");
            System.out.println("1. Start Game");
            System.out.println("2. Load Game");
            System.out.println("3. Exit");
            System.out.print("-> : ");
        
            userChoice = scan.nextInt();
        }
    }

    public static void misc()
    {
        int day = 24;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    


        String fruit = "Apple";

        switch (fruit) {
            case "Apple":
                System.out.println("Apples are red or green.");
                break;
            case "Banana":
                System.out.println("Bananas are yellow.");
                break;
            case "Orange":
                System.out.println("Oranges are orange.");
                break;
            default:
                System.out.println("Unknown fruit.");
                break;
        }
    }
}