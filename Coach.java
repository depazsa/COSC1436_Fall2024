public class Coach
{
    //variable declarations
    public String name;
    private String role;
    private int experience;

    /**
     * 
     * default constructor 
     */
    public Coach()
    {
        name = "John";
        role = "head coach";
        experience = 22;
    }

    public Coach(String name)
    {
        this.name = name;
    }

    public Coach(String role, int exp)
    {
        this.role = role;
        experience = exp;
    }

    public Coach(String name, String role, int exp)
    {
        this.name = name;
        this.role = role;
        experience = exp;
    }



    public void trainTeam()
    {
        System.out.println(name + "trains the team.");
    }

    public void makeStrategy()
    {
        System.out.println(name + "makes strategy.");
    }

    public String toString()
    {
        return ("name: " + name + "\nposition: " + role + "\nexperience: " + experience);
    }
}