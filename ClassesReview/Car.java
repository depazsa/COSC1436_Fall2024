public class Car
{
    //attributes
    private String model;
    private int year;
    private Person owner;

    /**
     * This is the constructor for a car
     */
    public Car(String model, int modelYear)
    {
        this.model = model;
        year = modelYear;

    }


    public void setOwner(Person owner)
    {
        this.owner = owner;
    }


    /**
     * This is the overridden toString method
     */
    @Override
    public String toString()
    {
        return "Car Model: " + model + ", Year: " + year + 
                "\nThis car is owned by " + owner.getName();
    }

    /**
     * This is a getter for the car's model
     * @return - the model of the car
     */
    public String getModel()
    {
        return model;
    }

    /**
     * This is the getter for the car's year
     * @return - the year the car was manufactured
     */
    public int getYear()
    {
        return year;
    }

    /**
     * This is how you change the year of the car
     * @param modelYear
     */
    public void setYear(int modelYear)
    {
        year = modelYear;
    }

    /** 
     * this is how you change the model of the car
     */
    public void setModel (String model)
    {
        this.model = model;
    }
}