public class Runner
{
    public static int myNumber = 5;

    public static void main (String [] args)
    {
        intro();
        System.out.println(myNumber + doMath());
    }

    private static void intro()
    {
        System.out.println("Welcome to class and to September.");
        Team team1 = new Team("Banana Slugs", "Santa Cruz", "ACC");
        Coach coach1 = team1.hireCoach();
        System.out.println(coach1);

        /*
        Coach coach1 = new Coach("chad", "waterboy", 1);
        Coach coach2 = new Coach();
        System.out.println(coach1.name);
        coach1.trainTeam();
        System.out.println(coach2.name);
        coach2.makeStrategy();
         */
    }

    private static double doMath()
    {
        return 5*5;
    }


}
