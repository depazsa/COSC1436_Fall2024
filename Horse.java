/**
 * 
 *  This is the horse class
 */
public class Horse
{
    private String name;

    /**
     * This gives the horse a new name
     * @param name - the name of the horse
     */
    public Horse(String name)
    {
        this.name = name;
    }

    /**
     * this returns the horse's name
     * @return - the name of the horse
     */
    public String getName()
    {
        return name;
    }

    /**
     * This sets the name of the horse
     * @param name - this is the new name of the horse
     */
    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "Nay! my name is " + name;
    }

}