public class Runner
{
    public static void main (String [] args)
    {
        Cowboy cowboy1 = new Cowboy("Stetson McCurdy", 15.2);
        cowboy1.acquireHorse();
        System.out.println(cowboy1.getHorse());
    }
}
