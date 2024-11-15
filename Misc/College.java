public class College extends School{
    public String mascot;

    @Override
    public void battleCry(){
        super.battleCry();
        System.out.println("Go " + mascot +"!");
    }
}