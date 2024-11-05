import java.util.Scanner;

public class FlowControl
{
    private static Scanner kb = new Scanner(System.in);

    public static void main(String [] args)
    {
        for(int row = 1; row<10; row++)
        {
            System.out.print("row" + row + ":\t");
                for(int col = 1; col<10; col++)
                {
                    System.out.print(row + "\t");
                    
                }
            System.out.println();
        }


        /*
        boolean playAgain = true;

        while(playAgain)
        {
            System.out.println("Do you want to play again?");
            if (kb.nextLine().toLowerCase().charAt(0)== 'n')
            {
                playAgain = false;
            }
        }


        
        System.out.print("What is your name: ");
        String userName = kb.nextLine();
        if(userName.toUpperCase().contains("JIM"))
        {
            System.out.println("Nice to meet you, Jimmy");
        } 
        else
        {
            System.out.println("Nice name.");
        }*/
    }
}