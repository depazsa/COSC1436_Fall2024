public class Turtle
{
    private boolean canSwim;
    public String color;

    /**
     * this is the default constructor
     */
    public Turtle()
    {

    }

    /**
     * This is the constructor with both parameters used
     * @param canSwim - can your turtle swim?
     * @param color - what color is your turtle?
     */
    public Turtle(boolean canSwim, String color)
    {
        this.canSwim = canSwim;
        this.color = color;
    }

    /**
     * Is this a tortoise
     * @return - if you can't swim, you are a tortoise
     */
    public boolean isTortoise()
    {
        return !canSwim;
    }
}