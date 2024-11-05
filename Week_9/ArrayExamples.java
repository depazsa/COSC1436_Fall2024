public class ArrayExamples
{
    public static void main(String [] args)
    {
        /*
        int [] myNumbers = {0,1,5,7,9};
        int [] myNumbers2 = new int[6];
        for(int i = 0; i<myNumbers2.length; i ++)
        {
            myNumbers2[i] = (int)(Math.random()*100)+1;
        }
        System.out.println(myNumbers2);

        myNumbers2[6] = 1059;
        int myNumbers3[] = new int[7];

        System.out.println(myNumbers2);
        printArray(myNumbers);
        printArray(myNumbers2);
        printArray(myNumbers3);
         */
        int aliveCats = 0;
        int deadCats = 0;
         for(int i = 0; i<10000; i++){
            if(Schroedinger())
            {
                System.out.println("Your cat is alive. :D");
                aliveCats ++;
            }
            else
            {
                System.out.println("Your cat is dead. :(");
                deadCats ++;
            }

            System.out.println("There are " + aliveCats + " cats alive and " + deadCats + " dead cats.");
         }

    }

    public static void printArray(int [] arr)
    {
        int i;
        System.out.print("[");
        for(i = 0; i< arr.length - 1; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[i] + "]");
    }

    public static boolean Schroedinger()
    {
        return(Math.random()+0.5) > 1;
    }
}