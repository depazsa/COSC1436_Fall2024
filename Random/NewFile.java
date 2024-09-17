public class NewFile
{
    public static void main(String [] args)
    {
        int a = 5;
        int b = 6;
        /*
        System.out.println(isPrime(29));
        System.out.println(isPrime(102));
        */
        Turtle fido = new Turtle(true, "green");

        Turtle bigGuy = new Turtle(false, "yellow");

        System.out.println(fido.isTortoise());
        System.out.println(bigGuy.isTortoise());
    }

    /**
     * This method will add two numbers together
     * @param firstNum - the first number passed in
     * @param secondNum - the second number passed in 
     * @return the sum of the two numbers
     */
    public static int addNumbers(int firstNum, int secondNum)
    {
        int result;
        // add two numbers
        result = firstNum + secondNum;
        return result;
    }

    public static boolean isPrime(int testNum)
    {
        //test every number to see if there are any factors, starting with 2
        int count = 2;
        // and there are never any factors greater than 1/2 the testNum
        while(count <= testNum / 2)
        {
            if(testNum % count == 0)
            {
                //System.out.println(testNum%count);
                return false;
            }
            count++;
        }
        return true;
    }

}