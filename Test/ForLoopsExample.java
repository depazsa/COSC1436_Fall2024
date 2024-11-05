public class ForLoopsExample
{
    public static void main(String [] args)
    {
        for(int i = 5; i >=1; i--)
        {
            System.out.println("the value of i is " + i);
        }

        int sum = 0;
        for (int k = 1; k <= 5; k++) {
            sum += k;
        }
        System.out.println("The total sum is: " + sum);

    }

    public static void shortCutOperations()
    {
        int x = 0;
        x -= 3;  // Subtract 3 from x
        x += 5;  // Add 5 to x (same as x = x + 5)
        x *= 2;  // Multiply x by 2
        x /= 4;  // Divide x by 4
        x %= 2;  // Store the remainder of x divided by 2
        
        int y = 5;
        System.out.println(++y);  // Outputs 6 (prefix: increment first)
        System.out.println(y++);  // Outputs 6 (postfix: use first, then increment)

        System.out.println(y--);
    }
}

