public class Cat extends Animal{
    String breed;

    public Cat(int age, double weight, String breed) {
        super(age, weight); // Calls the Animal constructor
        this.breed = breed;
        System.out.println("Cat constructor called.");
    }
}