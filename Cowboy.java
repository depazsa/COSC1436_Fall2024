import java.util.Scanner;
/**
 * This is the Stable class
 */
public class Cowboy
{
    private String name;
    private double amountOfChili;
    private Horse horse1;

    
    private static Scanner kb = new Scanner(System.in);

    public Cowboy()
    {

    }

    public Cowboy(String name, double amount) // <---- called this constructor
    {
        this.name = name;
        amountOfChili = amount;
    }

    public void acquireHorse()
    {
        System.out.println("What is the name of your horse?");
        horse1 = new Horse(kb.nextLine());
    }

    // setters or mutators
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAmountOfChili(double amount)
    {
        amountOfChili = amount;
    }
    

    // getters or accessors

    /**
     * this returns the name of the stable
     * @return- the numbers of name
     */
    public String getName(){
        return name;
    }

    /**
     * this returns the number of stalls
     * @return- the number of stalls
     */
    public double getAmountOfChili(){
        return amountOfChili;
    }

    public Horse getHorse()
    {
        return horse1;
    }


    
}