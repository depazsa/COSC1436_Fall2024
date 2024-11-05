public class Decisions
{
    

    /*
    * == - checks to see if two values are equal (primitive)
    * != - checks to see if two values are not equal
    * > - checks to see if the value on the left is greater than the value on the right
    * < - checks to see if the value on the left is less than the value on the right
    * >= - checks to see if the value on the left is greater than or equal to the value on the right
    * <= - checks to see if the value on the left is less than or equal to the value on the right
    * str.equals() is the string method to determine equality
    *
    * && - is the logical operator for AND, requiring both the left and right to be true
    * || - is the logical operator for OR, requiring either the left and right or both to be true
    */

    

    public static void main(String [] args) 
    {
        boolean isRaining = false;
        boolean isSnowing = true;
        int age = 20;
        boolean isStudent = true;

        String userName = "admin";
        String password = "password123";

        if(userName.equals("admin") && password.equals("password123"))
        {
            System.out.println("Login successful");
        }
        else 
        {
            System.out.println("invalid credentials");
        }
        
        if ((age < 18 || age > 65) && isStudent) {
            System.out.println("You qualify for a discount.");
        }
    
    
        if(isRaining || isSnowing)
        {
            System.out.println("Take an umbrella or wear a coat.");
        }

    }


    public static void misc()
    {
        boolean isRaining = true;
        boolean hasUmbrella = true;
        boolean isWeekend = true;
        boolean hasLicense = true;
        int age = 24;
        int temperature = 70;

        boolean isMember = true;
        boolean hasPaid = false;

        if (!isMember || !hasPaid)) {
            System.out.println("Access denied.");
        }

        if(isWeekend && isRaining)
        {
            System.out.println("Stay home and relax");
        }
        else if(isWeekend && !isRaining)
        {
            System.out.println("Go outside and enjoy the day");
        }
        else
        {
            System.out.println("It is a weekday. Time to work");
        }

        if(temperature > 95)
        {
            System.out.println("It is really hot outside");
        }
        else if(temperature > 80)
        {
            System.out.println("It is warm outside.");
        }
        else // this allows the program to respond to true and false cases 
        {
            System.out.println("It is cool outside.");
        }

        if(age >= 18 && hasLicense)
        {
            System.out.println("You can drive");
        }
    }
}