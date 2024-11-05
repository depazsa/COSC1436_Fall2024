public class UsefulStringMethods
{
    public static void main (String [] args)
    {
        String str = "Hello, World!";
        System.out.println(str.length()); // Outputs: 13

        for(int i = str.length()-1; i>=0; i--)
        {
            System.out.println(str.charAt(i));
        }

        /*
        String str = "Hello";
        System.out.println(str.charAt(1)); // Outputs: 'e'

        
        String str = "Hello, World!";
        System.out.println(str.substring(7, 12)); // Outputs: 'World'

        String str = "Hello";
        System.out.println(str.toUpperCase()); // Outputs: 'HELLO'

        
        String str = "Hello, World!";
        System.out.println(str.indexOf('l')); // Outputs: 2
        System.out.println(str.lastIndexOf('l')); // Outputs: 10


        String str = "Hello, World!";
        System.out.println(str.contains("World")); // Outputs: true

        
        String str = "Hello";
        System.out.println(str.replace('l', 'p')); // Outputs: "Heppo"

        
        String str = "one, two, three";
        String[] parts = str.split(", ");
        for (String part : parts) {
            System.out.println(part);
        }

        
        String str1 = "hello";
        String str2 = "  hello  ";
        System.out.println(str1.equals(str2)); // Outputs: false
        System.out.println(str1.equalsIgnoreCase(str2)); // Outputs: false
        System.out.println(str1.equals(str2.trim())); // Outputs: true
         */
    }
}