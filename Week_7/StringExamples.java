public class StringExamples
{

    public static void main (String [] args)
    {
         // Using String
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += i; // Inefficient: creates a new String object each iteration
        }

        // Using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i); // Efficient: modifies the existing StringBuilder object
        }

        System.out.println("StringBuilder result: " + sb);       

    }

    public static void printEveryChar(String str)
    {
        for(int i = 0; i< str.length(); i++)
        {
            System.out.println(str.charAt(i));
        }
    }

    public static boolean isPalindrome(String str)
    {
        boolean result = true;
        for(int i = 0; i< str.length()/2; i++)
        {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) 
            {
                return false;
            }
        }
        return result;
    }

} 



        

        /*
        System.out.println(isPalindrome("Superdog"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("WhiteleyyeletihW"));
        System.out.println(isPalindrome("tacocat"));


        String str = "Hello";
        str = str + " World \n"; // create a new string object
        System.out.print(str);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb); // Outputs: Hello World

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf); // Outputs: Hello World
         */