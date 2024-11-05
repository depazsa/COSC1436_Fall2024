public class RandomAlgorithms
{
    public static void main(String [] args)
    {
        for(int i = 1500; i <= 20000; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i + " : " + isPrime(i));
            }
        }
    }

    public static boolean isPrime(int num)
    {
        boolean result = true;
        for(int i = 2; i*i <=num; i++ )
        {
            //if any number is a factor of the num, then it is not prime
            if(num % i == 0)
            {
                return false;
            }
        }
        return result;
    }
}