import java.util.Scanner;

public class Team
{
    public String name, city, division;
    private static Scanner kb = new Scanner(System.in);

    public Team()
    {
        
    }

    public Team(String name, String city, String div)
    {
        this.name = name;
        this.city = city;
        division = div;
    }

    public void playGame()
    {
        System.out.println(name + " plays hard."); 
    }

    public Coach hireCoach()
    {
        System.out.println("What is your new coach's name?: ");
        String coachName = kb.nextLine();
        System.out.println("What is your new coach's role?: ");
        String coachRole = kb.nextLine();
        System.out.println("How long has your coach been coaching? :");
        int coachExp = kb.nextInt();
        return new Coach(coachName, coachRole, coachExp);
    }

    public String toString()
    {
        return ("name: " + name + "\ndivision: " + division + "\ncity: " + city);
    }

}